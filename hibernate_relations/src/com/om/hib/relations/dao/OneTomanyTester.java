package com.om.hib.relations.dao;

import java.util.Collection;
import java.util.HashSet;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.om.hib.relations.dto.onetomany.DistrictDTO;
import com.om.hib.relations.dto.onetomany.StateDTO;
import com.om.hibernate.SessionFactoryUtil;

public class OneTomanyTester {

	public static void main(String[] args) {

		// step 1

		StateDTO karnataka = new StateDTO();
		karnataka.setLang("Kannada");
		karnataka.setName("karnataka");
		karnataka.setCmName("SIDDU");

		// step 2

		DistrictDTO gadag = new DistrictDTO();
		gadag.setName("Gadag");
		gadag.setPincode(582101);
		gadag.setPopulation(10);

		DistrictDTO bengaluru = new DistrictDTO();
		bengaluru.setName("Bengaluru");
		bengaluru.setPincode(560001);
		bengaluru.setPopulation(1);

		Collection<DistrictDTO> collection = new HashSet<>();

		collection.add(gadag);
		collection.add(bengaluru);
		// relate/refer
		karnataka.setDistrictDTOs(collection);

		Session session = SessionFactoryUtil.getFactory().openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(karnataka);
			tx.commit();
		} catch (HibernateException he) {
			he.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}

	}

}
