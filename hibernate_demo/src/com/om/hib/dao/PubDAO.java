package com.om.hib.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.om.hib.dto.PersonDTO;
import com.om.hib.dto.PubDTO;

public class PubDAO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PubDTO whiteHorse = new PubDTO();
		whiteHorse.setLocation("Orion Mall");
		whiteHorse.setPhone(234);
		whiteHorse.setName("WH-Family");
		// generate pk !!!
		//whiteHorse.setPrimary(1);

		// data into DB
		// component 1
		Configuration cfg = new Configuration();
		cfg.configure("Mysql.cfg.xml");
		cfg.addAnnotatedClass(PersonDTO.class);
		cfg.addAnnotatedClass(PubDTO.class);
		// component 2
		SessionFactory factory = cfg.buildSessionFactory();
		// component 3
		Session session = factory.openSession();
		// component 1 from component 3
		Transaction tx = session.beginTransaction();
		//session.save(whiteHorse);
		//pubDTO.class holding the mapped table and
		//serializable arg is the primary value
		PubDTO fromDB=session.load(PubDTO.class, 105);
		System.out.println(fromDB.getName());
		System.out.println(fromDB.getPrimary());
		fromDB.setName("Blue F");
		session.update(fromDB);
		tx.commit();
		session.close();
		// temp for standalone
		factory.close();

	}

}
