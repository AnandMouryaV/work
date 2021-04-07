package com.Hibernate.Examples.Client;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.Session;

import com.Hibernate.Examples.Entity.Actor;
import com.Hibernate.Examples.Entity.Address;
import com.Hibernate.Examples.Entity.Customer;
import com.Hibernate.Examples.Entity.Employee;
import com.Hibernate.Examples.Entity.EmployeeEnum;
import com.Hibernate.Examples.Entity.Guide;
import com.Hibernate.Examples.Entity.Message;
import com.Hibernate.Examples.Entity.Movie;
import com.Hibernate.Examples.Entity.Passport;
import com.Hibernate.Examples.Entity.Person;
import com.Hibernate.Examples.Entity.Student;
import com.Hibernate.Examples.Util.HibernateUtil;



public class HelloWorldClient {
	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		//Create Section
		/*
		 * Message message = new Message("HI MAurya");
		 * 
		 * session.save(message);
		 */
		
		
		/*
		 * Address address = new Address("old MIG", "Hyderabad", "502082"); Person
		 * person = new Person(); person.setAddress(address); person.setName("Anand");
		 * 
		 * session.save(person);
		 */
		
		/*
		 * Guide g2 = (Guide) session.get(Guide.class,2);
		 * 
		 * Student s1 = new Student(0, "Mourya", new Date(), g2);
		 */
		//  Student s3 = new Student (1,"Sindhu",new Date(),g1);
		  
		/*
		 * session.save(s1); session.getTransaction().commit();
		 */
		 
		/*
		 * Passport p = new Passport("JU3NURE2348");
		 * 
		 * Customer c = new Customer( "Rajesh", p); p.setCustomer(c); session.save(p);
		 * session.getTransaction().commit();
		 */
		
		/*
		 * Movie m = new Movie(); m.setMovieName("Raja");
		 * 
		 * Actor a =new Actor(); a.setActorName("Venkatesh"); Actor b = new Actor();
		 * b.setActorName("Soundrya"); m.addActors(a); m.addActors(b); session.save(m);
		 * session.getTransaction().commit();
		 */
		
		/*
		 * Employee e = new Employee(1234,"Varun",EmployeeEnum.FULLTIME);
		 * session.save(e); session.getTransaction().commit();
		 */
		//Select statement
			/*
			 * Student s = (Student)session.get(Student.class,1);
			 * System.out.println(s.toString());
			 */	/*
		 * Message msg = (Message) session.get(Message.class, 4L);
		 * System.out.println(msg.toString());
		 * 
		 * 
		 * msg.setMessage("making an Update statement after session is closed");
		 * 
		 * session.save(msg);
		 */
		
		Employee e1 = (Employee) session.get(Employee.class,8);
		System.out.println(e1.toString());
		//Delete an object
		/*
		 * Message deletemessage = (Message) session.get(Message.class, 6L);
		 * 
		 * session.delete(deletemessage);
		 */
		
		/*
		 * Student s = (Student) session.get(Student.class, 2); session.delete(s);
		 * session.getTransaction().commit();
		 */
		  

		/*
		 * session.close();
		 * 
		 * Session session2 =HibernateUtil.getSessionFactory().openSession();
		 * session2.beginTransaction(); Message m2 =
		 * (Message)session2.get(Message.class, 4L);
		 * msg.setMessage("check after close with merge"); session2.merge(msg);
		 * 
		 * session2.getTransaction().commit(); session2.close();
		 */
		session.close();

	}
}
