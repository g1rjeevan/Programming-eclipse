package com.jspiders.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.jpsiders.Main.Carwale;

public class InsertCar implements Carwale {
	
	
	public void insertcar(Connection c){
		
		Scanner s1=new Scanner(System.in);
		String sql="INSERT INTO jecm4.car VALUES(?,?,?)";
		
	
		try {
			PreparedStatement pstm = c.prepareStatement(sql);
			System.out.println("Enter the no. data to be inserted");
			int k=s1.nextInt();
			for (int i = 0; i < k; i++) {
				System.out.println("Enter the ID");
				int id=s1.nextInt();
				System.out.println("Enter the Car name");
				String name=s1.next();
				System.out.println("Enter the cost of the car");
				int cost=s1.nextInt();
				pstm.setInt(1, id);
				pstm.setString(2, name);
				pstm.setInt(3, cost);
				pstm.addBatch();
			}
			pstm.executeBatch();
			System.out.println("CAR DETAILS HAS BEEN INSERTED");
			
			
			
		} 
		
		catch (SQLException e1) {
			e1.printStackTrace();
		}
		finally{
			s1.close();
			
			}
		
		
	}

	@Override
	public void insertstate(Connection c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatecar(Connection c) {
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
