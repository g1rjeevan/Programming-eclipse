package conktDB1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert2Employee {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://Localhost:3306","root","java");
			Statement s=c.createStatement();
			s.execute("INSERT INTO jecm4.Employee VALUES(420,'Dinga',30000,'Developer')");
			c.close();
			System.out.println("Executed");

		} catch(ClassNotFoundException cn){
			System.out.println("Class Not Found Exception");	
			cn.printStackTrace();
		}
		catch(SQLException se){
			System.out.println("SQL Exception");	
			se.printStackTrace();
		}

	}

}
