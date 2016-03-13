package com.jspiders.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.jpsiders.Main.Carwale;

public class DisplayOnRoadPrice implements Carwale {
	public void displayonroadprice(Connection c){
		Scanner s1=new Scanner(System.in);
		String sql="SELECT * FROM jecm4.car WHERE name=?";
		String sql1="SELECT * FROM jecm4.tax WHERE state=?";
		int cost = 0;
		double taxrate = 0,totalcost=0;
		System.out.println("Enter the Car name");
		String cname=s1.next();
		System.out.println("Enter the State name");
		String sname=s1.next();
		try {
			PreparedStatement pstm = c.prepareStatement(sql);
			PreparedStatement pstm1 = c.prepareStatement(sql1);
			pstm.setString(1,cname);
			pstm1.setString(1,sname);
			ResultSet rst=pstm.executeQuery();
			ResultSet rst1=pstm1.executeQuery();

			if(rst.next()&&rst1.next()){
				cost=rst.getInt(3);
				taxrate=Double.parseDouble(rst1.getString(3));
				double taxcost=cost*(taxrate/100);
				totalcost=cost+taxcost;
				System.out.println("SHOWROOM PRICE OF THE CAR = Rs."+cost);
				System.out.println("TAXRATE IN THE CHOOSEN STATE = "+taxrate+"%");
				System.out.println("TAX COST FOR THE CHOOSEN CAR AT THE RESPECTIVE STATE = Rs."+taxcost);
				System.out.println("ON-ROAD PRICE OF CAR FOR THE RESPECTIVE STATE = Rs."+totalcost);

			}
			else{
				System.err.println("No such Details found");
			}

		} 
		catch (SQLException e) {
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
	public void displaygivencars(Connection c) {
		// TODO Auto-generated method stub
		
	}


}
