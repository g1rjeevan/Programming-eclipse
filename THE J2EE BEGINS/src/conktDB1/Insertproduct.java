package conktDB1;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Insertproduct {

	public static void main(String[] args){
int i=1;
Scanner s1=new Scanner(System.in);
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","java");
			Statement s=c.createStatement();
			String sql;
			while(i==1){
				sql=s1.nextLine();
				System.out.println(sql);
				s.execute(sql);
				System.out.println("Enter num");
				i=s1.nextInt();
				s1.nextLine();
			}
			c.close();
			System.out.println("SELECT * FROM flipkart.Product");
			System.out.println("DATABASE CLOSED");
		}
		catch(ClassNotFoundException cn){
		System.out.println("Class Not Found Exception");	
		cn.printStackTrace();
		}
		catch(SQLException se){
			System.out.println("SQL Exception");	
			se.printStackTrace();
		}
		
	}

}
