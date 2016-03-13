package conktDB1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;



public class CreateTable {

	public static void main(String[] args) {

		String d="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306";
		String user="root";
		String pass="java";
		String j3="CREATE TABLE jecm4.details3(email3 varchar(25),password3 varchar(25) NOT NULL);",
		j1="CREATE TABLE jecm4.details1(email1 varchar(25),password1 varchar(25) NOT NULL);",
		j2="CREATE TABLE jecm4.details2(email2 varchar(25),password2 varchar(25) NOT NULL);";
		Connection c=null;
		try{
			Class.forName(d);
			c=DriverManager.getConnection(url, user, pass);
			
				PreparedStatement s1=c.prepareStatement(j1);
				PreparedStatement s2=c.prepareStatement(j2);
				PreparedStatement s3=c.prepareStatement(j3);
				s1.execute();
				s2.execute();
				s3.execute();
				System.out.println("Done");	
			
			
		}
		catch(SQLException | ClassNotFoundException e){
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

}
