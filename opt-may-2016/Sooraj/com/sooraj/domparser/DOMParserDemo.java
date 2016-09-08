package com.sooraj.domparser;

import java.util.*;
import org.w3c.dom.*;
import org.xml.sax.*;
import javax.xml.parsers.*;
import java.sql.*;

public class DOMParserDemo {
	public static void main(String args[]) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = factory.newDocumentBuilder();
		Document doc = db.parse("customerdata.xml");
		// Get all the customer nodes
		NodeList list = doc.getElementsByTagName("customer");
		// The list will have 2 customer nodes.
		List customers = new ArrayList();
		for (int i = 0; i < list.getLength(); i++) {
			Node node = list.item(i);
			Element ele = (Element) node;
			String fn = getData(ele, "firstName");
			String mn = getData(ele, "middleName");
			String ln = getData(ele, "lastName");
			String age = getData(ele, "age");
			String ssn = getData(ele, "ssn");
			String city = getData(ele, "city");
			String state = getData(ele, "state");
			String country = getData(ele, "country");
			// Populate the customer bean and add it to the list
			CustomerInfo info = new CustomerInfo();
			info.setFirstName(fn);
			info.setMiddleName(mn);
			info.setLastName(ln);
			info.setAge(new Integer(age).intValue());
			info.setSsn(new Integer(ssn).intValue());
			info.setCity(city);
			info.setState(state);
			info.setCountry(country);
			// Add to the list
			customers.add(info);
		}
		saveToDatabase(customers);
		System.out.println(" XML data saved in the database");
	}

	private static String getData(Element element, String name) {
		String value = null;
		NodeList nl = element.getElementsByTagName(name);
		if (nl != null && nl.getLength() > 0) {
			Element el = (Element) nl.item(0);
			value = el.getFirstChild().getNodeValue();
		}
		return value;
	}

	private static void saveToDatabase(List customers) {
		Connection con=DBUtils.getConnection();
		try {
			
			String sql = "INSERT INTO customers1 VALUES(?,?,?,?,?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			for (int i = 0; i < customers.size(); i++) {
				CustomerInfo customer = (CustomerInfo) customers.get(i);
				stmt.setString(1, customer.getFirstName());
				stmt.setString(2, customer.getMiddleName());
				stmt.setString(3, customer.getLastName());
				stmt.setInt(4, customer.getAge());
				stmt.setInt(5, customer.getSsn());
				stmt.setString(6, customer.getCity());
				stmt.setString(7, customer.getState());
				stmt.setString(8, customer.getCountry());
				stmt.executeUpdate();
			}
		} catch (Exception e) {
			System.out.println("Exception while saving to database");
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}