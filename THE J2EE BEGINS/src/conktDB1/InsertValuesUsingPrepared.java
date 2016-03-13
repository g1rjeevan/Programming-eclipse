package conktDB1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertValuesUsingPrepared {

	
		public static void main(String[] args) {
			Scanner s1=new Scanner(System.in);
			String d="com.mysql.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306";
			String user="root";
			String pass="java";
			String sql="INSERT INTO jecm4.amazon VALUES(?,?,?,?)";
			String n=null,t=null,co=null,stock=null;
			Connection c=null;
			int i=1;
			try{
				Class.forName(d);
				c=DriverManager.getConnection(url, user, pass);
				PreparedStatement s=c.prepareStatement(sql);
				while(i==1){
					System.out.println("name");
					n=s1.next();
					s1.nextLine();
					s.setString(1,n);
					System.out.println("type");
					t=s1.next();
					s1.nextLine();
					s.setString(2,t);
					System.out.println("cost");
					co=s1.next();
					s1.nextLine();
					s.setString(3,co);
					System.out.println("stock");
					stock=s1.next();
					s1.nextLine();
					s.setString(4,stock);
					System.out.println("wanna continue press '1' or anykey");
					i=s1.nextInt();
					
				}
				s.executeUpdate();
				System.out.println("Done");
			}
			catch(SQLException | ClassNotFoundException e){
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

	}


