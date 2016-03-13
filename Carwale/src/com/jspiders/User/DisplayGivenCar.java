package com.jspiders.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;

import com.jpsiders.Main.Carwale;

public class DisplayGivenCar implements Carwale{
	public void displaygivencars(Connection c){
		Scanner s1=new Scanner(System.in);
		String sql="SELECT * FROM jecm4.car WHERE name=?";
		System.out.println("Enter the Car name");
		String name=s1.next();
		try {
			PreparedStatement pstm = c.prepareStatement(sql);
			pstm.setString(1,name);
			ResultSet rst=pstm.executeQuery();

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
				System.err.println("No such Car found");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				c.close();
				s1.close();

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
	public void displayallcars(Connection c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayonroadprice(Connection c) {
		// TODO Auto-generated method stub
		
	}


}
