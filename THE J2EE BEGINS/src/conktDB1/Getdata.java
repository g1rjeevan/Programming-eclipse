package conktDB1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Getdata {
	public static void main(String[] args) {
		String driverpath="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://Localhost:3306";
		String username="root";
		String paassword="java";
		try{
			Class.forName(driverpath);
			Connection c=DriverManager.getConnection(url,username,paassword);
			Statement s=c.createStatement();
			
			//String sql="SELECT * FROM flipkart.product WHERE Cost<=10000";
			String sql="SELECT * FROM flipkart.product";
			System.out.println("Product ID\tProduct Name\tType\t\tCost\tStock");
			ResultSet rs=s.executeQuery(sql);
			while(rs.next()){
				
				int PID=rs.getInt(1);
				String Pname=rs.getString(2);
				String Type=rs.getString(3);
				int cost=rs.getInt(4);
				int Stock=rs.getInt(5);
				System.out.println(PID+"\t\t'"+Pname+"'\t'"+Type+"'   \t"+cost+"\t"+Stock);
			}
			c.close();
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
/*
 //String sql="SELECT * FROM jecm4.Student";
 //String sql="SELECT * FROM flipkart.product WHERE Stock<=50";
//String sql="SELECT * FROM flipkart.product WHERE Type='ANDROID'";
//String sql="SELECT * FROM flipkart.product WHERE Type='IOS'";
//String sql="SELECT * FROM flipkart.product WHERE Type='WINDOWS'";
//String sql="SELECT * FROM flipkart.product WHERE Cost<=10000";
//String sql="SELECT * FROM flipkart.product WHERE Cost<=20000";
//String sql="SELECT * FROM flipkart.product WHERE Cost<=30000";
//String sql="SELECT * FROM flipkart.product WHERE Cost<=90000";
//String sql="SELECT * FROM flipkart.product WHERE Cost<=1000";
//String sql="SELECT * FROM flipkart.product WHERE Cost BETWEEN (10000,20000)";
//System.out.println("name\tage\tfname\trollno\tstd");
//String name=rs.getString(1);
//LinkedList l=new LinkedList();
//Iterator l1=l.iterator();
//While(l1.hasnext());
//Object o1=l1.next();
//int age=rs.getInt(2);
//String fname=rs.getString(3);
//int rollno=rs.getInt(4); 
//int std=rs.getInt(5);
//System.out.println(name+"\t"+age+"\t"+fname+"\t"+rollno+"\t"+std);*/
