package com.jspiders.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.jpsiders.Main.Carwale;

public class UpdateTheCar implements Carwale {
	public void updatecar(Connection c){

		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the Car name");
		String name=s1.next();
		String sql="UPDATE jecm4.car SET cost=? WHERE name='"+name+"'";
		System.out.println("Enter the new cost of the Car");
		double cost=s1.nextDouble();

		try {
			PreparedStatement pstm = c.prepareStatement(sql);
			pstm.setDouble(1, cost);
			int i=pstm.executeUpdate();
			if(i!=0){
				System.out.println("CAR DETAILS HAS BEEN UPDATED");
			}
			else{
				System.out.println("NO SUCH CAR HAS BEEN FOUND TO UPDATE FOR THE GIVEN CAR");
			}


		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		finally{
			s1.close();
		}


	}

	@Override
	public void insertcar(Connection c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertstate(Connection c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatestate(Connection c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletecar(Connection c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletestate(Connection c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayallcars(Connection c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displaygivencars(Connection c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayonroadprice(Connection c) {
		// TODO Auto-generated method stub
		
	}

}