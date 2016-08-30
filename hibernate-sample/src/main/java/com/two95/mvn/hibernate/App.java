package com.two95.mvn.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Creates a session factory instance and stores employee values to database
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
     // Call the save() method to insert a record in database.
        System.out.println("******* WRITE *******");
        Employee empl = new Employee("Jack", "Bauer", new Date(System.currentTimeMillis()), "911");
        empl = save(empl);
    }
    
    private static Employee save(Employee employee) {
    	SessionFactory sf = HibernateUtil.getSessionFactory();
    	Session session = sf.openSession();
    	session.beginTransaction();

    	Long id = (Long) session.save(employee);
    	employee.setId(id);
    		
    	session.getTransaction().commit();
    		
    	session.close();

    	return employee;
    }

}
