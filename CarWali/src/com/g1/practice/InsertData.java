package com.g1.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertData extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("parName");
		String brand=req.getParameter("parBrand");
		String scost=req.getParameter("parCost");
		int cost=Integer.parseInt(scost);
		ServletContext cont=getServletContext();
		String d=cont.getInitParameter("Driver");
		String ur=cont.getInitParameter("url");
		String us=cont.getInitParameter("user");
		String pass=cont.getInitParameter("pass");
		Connection con=null;
		PrintWriter pw=resp.getWriter();

		try{
			Class.forName(d);
			con=DriverManager.getConnection(ur,us,pass);
			String sql="INSERT INTO jecm4.carwale VALUES(?,?,?)";
			PreparedStatement pstm=con.prepareStatement(sql);
			pstm.setString(1,name);
			pstm.setString(2,brand);
			pstm.setInt(3, cost);
			pstm.executeUpdate();
			pw.println("<html><body>");
			pw.println("<h1>data inserted</h1>");
			pw.print("<a href='insert.html'>Back</a>");
			pw.println("</body></html>");

		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			if(con!=null){
				try {

					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
/*
 pw.println("<html><body>");
			pw.println("<h1>Please enter the unique car names</h1>");
			pw.print("<a href='insert.html'>Back</a>");
			pw.println("</body></html>");
 */
