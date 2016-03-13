package com.jspiders.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.jpsiders.Main.Carwale;

public class DeleteTheState implements Carwale{
	public void deletestate(Connection c){

		Scanner s1=new Scanner(System.in);

		String sql="DELETE FROM jecm4.tax WHERE state=?";
		System.out.println("Enter the State name");
		String name=s1.next();

		try {
			PreparedStatement pstm = c.prepareStatement(sql);
			pstm.setString(1, name);
			int i=pstm.executeUpdate();
			if(i!=0){
			System.out.println("STATE DETAILS HAS BEEN DELETED");
			}
			else{
				System.out.println("NO SUCH STATE HAS BEEN FOUND TO DELETE FOR THE GIVEN STATE");
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
	public void updatestate(Connection c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletecar(Connection c) {
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
