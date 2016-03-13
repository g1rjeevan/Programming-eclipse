package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



public class Verify_login 
{
	public static void main(String[] args) {
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/jecm4";
		String user="root";
		String pass="java";
		Connection con=null;
		Scanner s=new Scanner(System.in);
		try{
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,pass);
			System.out.println("Enter email-id");
			String email=s.next();
			System.out.println("Enter the password");
			String loginpass=s.next();
			String sql="SELECT * FROM details WHERE email=? AND password=?";
			PreparedStatement pstm=con.prepareStatement(sql);
			pstm.setString(1,email);
			pstm.setString(2, loginpass);
			ResultSet rs=pstm.executeQuery();
			if(rs.next()){
				System.out.println("WELCOME TO THE HOMEPAGE");
			}
			else {
				System.out.println("EITHER EMAIL/PASSWORD IS WRONG");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try {
				if(con!=null)
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			s.close();
		}
		
	}

}
