package com.om.hib.relations.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.om.hib.relations.dto.onetoone.CaptainDTO;
import com.om.hib.relations.dto.onetoone.TeamDTO;
import com.om.hibernate.SessionFactoryUtil;

public class OneToOneTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TeamDTO india = new TeamDTO();
		india.setCountry("India-A");
		india.setTeamSize(11);
		india.setName("Team-INDIA-A");

		CaptainDTO dhoni = new CaptainDTO();
		dhoni.setGender('M');
		dhoni.setName("DHONI-1");
		dhoni.setNation("IND");
		// relate/ref
		india.setCaptainDTO(dhoni);
		dhoni.setTeamDTO(india);

		Session session = SessionFactoryUtil.getFactory().openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(dhoni);
			// session.save(dhoni);
			tx.commit();
		} catch (HibernateException he) {
			he.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}

	}

}
