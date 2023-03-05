package com.Mobile_sim;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainMobile_Sim {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vjmadne");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction=entityManager.getTransaction();
	Mobile m=new Mobile();
	m.setId(103);
	m.setBrand("Readmi");
	m.setCost(25000.00);

	Sim s1=new Sim();
	s1.setId(205);
	s1.setProvide("idia");
	s1.setImrc("abc45265");
	
	Sim s2=new Sim();
	s2.setId(206);
	s2.setProvide("Airtel");
	s2.setImrc("abc7109");

	List<Sim> simofList=new ArrayList();
	simofList.add(s1);
	simofList.add(s2);
	
	
	m.setSim(simofList);
	entityTransaction.begin();
	entityManager.persist(s1);
	entityManager.persist(s2);

	entityManager.persist(m);
	entityTransaction.commit();

	}

}
