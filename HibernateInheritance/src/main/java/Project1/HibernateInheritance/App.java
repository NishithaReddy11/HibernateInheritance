package Project1.HibernateInheritance;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Project1.DeloitteConsultant;
import Project1.Employee;
import Project1.SystemEngineer;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	SessionFactory sf=new Configuration().configure("hibernate.cfg.xml")
    			.addAnnotatedClass(Employee.class)
				.addAnnotatedClass(SystemEngineer.class)
				.addAnnotatedClass(DeloitteConsultant.class)
				.buildSessionFactory();
    }
}
