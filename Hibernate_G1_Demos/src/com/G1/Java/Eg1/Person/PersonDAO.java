package com.G1.Java.Eg1.Person;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PersonDAO {
	static Scanner scan=new Scanner(System.in);


	public PersonDTO add(PersonDTO pdto){
		System.out.println("Checking checking 1..2..3..");
		System.out.println("Enter the person name");
		String pName=scan.next();
		System.out.println("Enter the gender Male or Female");
		String pGen=scan.next();
		char pGene[]=pGen.toCharArray();
		char pGender=pGene[0];
		System.out.println("Enter the Bloodgroup");
		String pBloodGroup=scan.next();
		System.out.println("Enter the person age");
		int pAge=scan.nextInt();
		System.out.println("Enter the person relationship status");
		String pStatus=scan.next();

		pdto.setpName(pName);
		pdto.setpGender(pGender);
		pdto.setpBloodGroup(pBloodGroup);
		pdto.setpAge(pAge);
		pdto.setpStatus(pStatus);
		return pdto;

	}
	public PersonDTO delete(PersonDTO pdto,Session session, Transaction tx){
		System.out.println("Enter the person name");
		String pName=scan.next();
		System.out.println("Enter the person ID");
		int pID=scan.nextInt();
		String hql="FROM PersonDTO WHERE pName='"+pName+"' AND pId="+pID;
		Query query=session.createQuery(hql);
		PersonDTO pN=(PersonDTO) query.uniqueResult();
		return pN;
	}
	public PersonDTO update(PersonDTO pdto,Session session, Transaction tx){
		System.out.println("Enter the person Name");
		String pName=scan.next();
		String hql="FROM PersonDTO WHERE pName='"+pName+"'";
		Query query=session.createQuery(hql);
		PersonDTO pN=(PersonDTO) query.uniqueResult();
		tx=session.beginTransaction();
		pdto=session.load(PersonDTO.class, pN.getpId());
		System.out.println(pdto.getpName());
		System.out.println(pdto.getpId());
		System.out.println("Enter ther age");
		int pAge=scan.nextInt();
		pdto.setpAge(pAge);
		System.out.println(pdto.getpStatus());
		return pdto;
	}

}
