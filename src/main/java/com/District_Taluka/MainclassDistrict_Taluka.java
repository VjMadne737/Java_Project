package com.District_Taluka;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainclassDistrict_Taluka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory	entityManagerFactory=Persistence.createEntityManagerFactory("vjmadne");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		District d=new District();
		d.setId(585105);
		d.setName("Gulbarga");
		Taluka t1=new Taluka();
		t1.setId(101);
		t1.setTname("Aland");
		Taluka t2=new Taluka();
		t2.setId(102);
		t2.setTname("Afzalpur");
		Taluka t3=new Taluka();
		t3.setId(103);
		t3.setTname("Chincholi");
		Taluka t4=new Taluka();
		t4.setId(104);
		t4.setTname("Sedam");
		Taluka t5=new Taluka();
		t5.setId(105);
		t5.setTname("Jewargi");
		Taluka t6=new Taluka();
		t6.setId(106);
		t6.setTname("Shahapur");
		
		Taluka t7=new Taluka();
		t7.setId(107);
		t7.setTname("Yadgiri");
		
		Taluka t8=new Taluka();
		t8.setId(108);
		t8.setTname("Shorapur");

		List<Taluka>listofTaluka=new ArrayList();
		listofTaluka.add(t1);
		listofTaluka.add(t2);
		listofTaluka.add(t3);
		listofTaluka.add(t4);
		listofTaluka.add(t5);
		listofTaluka.add(t6);
		listofTaluka.add(t7);
		listofTaluka.add(t8);

		d.setListTaluka(listofTaluka);
		entityTransaction.begin();
		entityManager.persist(t1);
		entityManager.persist(t2);
		entityManager.persist(t3);
		entityManager.persist(t4);
		entityManager.persist(t5);
		entityManager.persist(t6);
		entityManager.persist(t7);
		entityManager.persist(t8);

		entityManager.persist(d);
		entityTransaction.commit();

	}

}
