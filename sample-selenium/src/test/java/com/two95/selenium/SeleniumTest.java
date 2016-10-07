package com.two95.selenium;

import static junit.framework.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * https://www.seleniumeasy.com/selenium-webdriver-tutorials
 * @author schand018c
 *
 */
public class SeleniumTest {
	private String baseUrl;
	private WebDriver driver;
	private ScreenshotHelper screenshotHelper;
	private Wait<WebDriver> wait;


	@Before
	public void openBrowser() {
		File file = new File("C:/selenium/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		baseUrl = System.getProperty("webdriver.base.url");
		driver = new ChromeDriver();
		driver.get(baseUrl);
		wait = new WebDriverWait(driver, 30);

	}

	@After
	public void saveScreenshotAndCloseBrowser() throws IOException {
		
		driver.quit();
	}

	@Test
	public void pageTitleAfterSearchShouldBeginWithDrupal() throws IOException {
		assertEquals("The page title should equal Google at the start of the test.", "Google", driver.getTitle());
		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("Drupal!");
		searchField.submit();
		screenshotHelper = new ScreenshotHelper();
		screenshotHelper.saveScreenshot("screenshot.png");
	}
	
	@Test
	public void searchTestNGInGoogle() {
		final String searchKey = "TestNG";
		System.out.println("Search " + searchKey + " in google");
		driver.navigate().to("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		System.out.println("Enter " + searchKey);
		element.sendKeys(searchKey);
		System.out.println("submit"+new Date());
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		System.out.println("after wait--->"+new Date());
		element.submit();
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.getTitle().toLowerCase()
						.startsWith(searchKey.toLowerCase());
			}
		});
		System.out.println("Got " + searchKey + " results");
		 // Wait for search to complete
        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver webDriver) {
                System.out.println("Searching ...");
                return webDriver.findElement(By.id("resultStats")) != null;
            }
        });
	}

	private class ScreenshotHelper {

		public void saveScreenshot(String screenshotFileName) throws IOException {
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File(screenshotFileName));
		}
	}
}