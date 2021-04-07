package com.Hibernate.Examples.Client;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.Hibernate.Examples.Entity.Guide;
import com.Hibernate.Examples.Entity.Student;




public class HelloWorldJPA {



	public static void main(String[] args){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello-world");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
	try {
		txn.begin();

		Guide g = new Guide(444, "krish", new BigDecimal(30000));
		Student s = em.find(Student.class, 5);
		s.setGuide(g);
		em.persist(s);
		txn.commit();
	
		
	} catch (Exception e) {
		if (txn != null) {
			txn.rollback();
		}
		e.printStackTrace();
	} finally {
		if (em != null) {
			em.close();
		}
	}


}
}