package com.G1.Java.Eg1.Person;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PersonDAO {


	public VOIDa
	dd(PersonDTO pdto){
		
		
		
	}
	public void delete(PersonDTO pdto){
		System.out.println("Enter the person name");
		String pName=scan.next();

		System.out.println("Enter the person ID");
		int pID=scan.nextInt();

		pdto.setpName(pName);

		pdto.setpId(pID);

	}
	public void update(PersonDTO pdto){

		System.out.println("Enter the person name");
		String pName=scan.next();

		System.out.println("Enter the person ID");
		int pID=scan.nextInt();

		pdto.setpName(pName);

		pdto.setpId(pID);



	}


}