package com.controller_Bus;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence; 

import com.Bus.Dao.Bus;
import com.Bus.Dao.Organization;

public class MainBus_Organization {
	public static void main(String[] args) {
		
	
	EntityManagerFactory	entityManagerFactory=Persistence.createEntityManagerFactory("vjmadne");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Organization o=new Organization();
	o.setId(202);
	o.setName("Royal Travels");
	o.setAddress("Nagpur to Pune");
    Bus b1=new Bus();
    b1.setId(51);
    b1.setCapacity(50);
    b1.setType("Non AC Sleeper");
    b1.setCost(500);
    
    Bus b2=new Bus();
    b2.setId(52);
    b2.setCapacity(80);
    b2.setType("sleeper");
    b2.setCost(900);
    
    Bus b3=new Bus();
    b3.setId(53);
    b3.setCapacity(50);
    b3.setType("AC Sleeper");
    b3.setCost(1500);
    
    Bus b4=new Bus();
    b4.setId(54);
    b4.setCapacity(90);
    b4.setType("Non Ac Sleeper");
    b4.setCost(900);
List<Bus> listofBus =new ArrayList();
listofBus.add(b1);
listofBus.add(b2);
listofBus.add(b3);
listofBus.add(b4);
o.setListofBus(listofBus);
entityTransaction.begin();
entityManager.persist(b1);
entityManager.persist(b2);
entityManager.persist(b3);
entityManager.persist(b4);
entityManager.persist(o);
entityTransaction.commit();




     
	}

}
