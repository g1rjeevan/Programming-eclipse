package com.jspiders.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.jpsiders.Main.Carwale;

public  class InsertNewStateTax implements Carwale {
public void insertstate(Connection c){
		
		Scanner s1=new Scanner(System.in);
		String sql="INSERT INTO jecm4.tax VALUES(?,?,?)";
		
	
		try {
			PreparedStatement pstm = c.prepareStatement(sql);
			System.out.println("Enter the no. data to be inserted");
			int k=s1.nextInt();
			for (int i = 0; i < k; i++) {
				System.out.println("Enter the ID");
				int id=s1.nextInt();
				System.out.println("Enter the State name");
				String name=s1.next();
				System.out.println("Enter the tax rate");
				double tax=s1.nextDouble();
				pstm.setInt(1, id);
				pstm.setString(2, name);
				pstm.setDouble(3, tax);
				pstm.executeBatch();
			}
			
			pstm.executeBatch();
			System.out.println("STATE DETAILS HAS BEEN INSERTED");
			
			
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
