package conktDB1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert2Student {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		int con = 1;
		while(con==1){
			System.out.println("Insert Name");
			String Name=s.next();
			System.out.println("Insert Age");
			int Age=s.nextInt();
			System.out.println("Insert Fathername");
			String Fathername=s.next();
			System.out.println("Insert Rollno");
			int Rollno=s.nextInt();
			System.out.println("Insert std");
			int std=s.nextInt();
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection c=DriverManager.getConnection("jdbc:mysql://Localhost:3306","root","java");
				Statement st=c.createStatement();
				st.execute("INSERT INTO jecm4.Student VALUES('"+Name+"',"+Age+",'"+Fathername+"',"+Rollno+","+std+")");
				st.executeQuery("SELECT * FROM jecm4.Student");
				c.close();
				System.out.println("Executed");
			}
			catch(ClassNotFoundException cn){
				System.out.println("Class Not Found Exception");	
				cn.printStackTrace();
			}
			catch(SQLException se){
				System.out.println("SQL Exception");	
				se.printStackTrace();
			}
			finally{
				System.out.println("wish to continue press 1 or any key");
				con=s.nextInt();
			}
			
		}
		
	}
}
