package com.jspiders.DB;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBonObject {
	
	public static Connection conObject() throws IOException{
		FileInputStream file=new FileInputStream("Myproperties.properties");
		Properties prp=new Properties();
		prp.load(file);
		String d=prp.getProperty("driver");
		String u=prp.getProperty("url");
		String us=prp.getProperty("user");
		String p=prp.getProperty("pass");
		
		Connection con=null;
		try{
			Class.forName(d);
			con=DriverManager.getConnection(u,us,p);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return con;
		
	}

}
