package com.jspiders.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.jpsiders.Main.Carwale;

public class UpdateTheStateTax implements Carwale{

public void updatestate(Connection c){
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the State name");
		String name=s1.next();
		String sql="UPDATE jecm4.tax SET tax=? WHERE state='"+name+"'";
		System.out.println("Enter the tax rate");
		double tax=s1.nextDouble();
	
		try {
			PreparedStatement pstm = c.prepareStatement(sql);
			pstm.setDouble(1, tax);
			int i=pstm.executeUpdate();
			if(i!=0){
			System.out.println("STATE DETAILS HAS BEEN UPDATED");
			}
			else{
				System.out.println("NO SUCH STATE HAS BEEN FOUND TO UPDATE FOR THE GIVEN STATE");
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
public void updatecar(Connection c) {
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
