package com.jspiders.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jpsiders.Main.Carwale;

public class DisplayAllCars implements Carwale{

	public void displayallcars(Connection c){

		String sql="SELECT * FROM jecm4.car";
		try {
			Statement stm = c.createStatement();
			ResultSet rst=stm.executeQuery(sql);
			if(rst.next()){
			System.out.println("ID\tName         \tCost");
			while(rst.next()){
				System.out.println("--------------------------------------------------");
				int i=rst.getInt(1);
				String n=rst.getString(2);
				int co=rst.getInt(3);
				System.out.println(i+"\t"+n+"       \t"+co);
				

			}
			System.out.println("--------------------------------------------------");
			}
			else{
				System.out.println("NO CAR TO DISPLAY");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				c.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
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
	public void displaygivencars(Connection c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayonroadprice(Connection c) {
		// TODO Auto-generated method stub
		
	}


}


