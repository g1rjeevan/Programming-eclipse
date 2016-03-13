package com;

import java.io.*;
import java.sql.*;
import javax.servlet.*;

public class Search_engine extends GenericServlet {

	public Search_engine()
	{
	}
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException
	{
		String d="com.mysql.jdbc.Driver";
		String ur="jdbc:mysql://localhost:3306/hibernate_jpa_jbdc";
		String us="root";
		String ps="java";
		resp.setContentType("text/html");
		String bRefIds = req.getParameter("ParReferenceId");
		String eId = req.getParameter("ParEmailID");
		Integer bRefId=Integer.parseInt(bRefIds);
		PrintWriter pw = resp.getWriter();
		try {
			Class.forName(d);
			Connection con=DriverManager.getConnection(ur, us, ps);

			String sql1="select * from tui  where Booking_reference="+bRefId+";";
			String sql2="select * from tui  where email_id='"+eId+"';";

			PreparedStatement pstm1=con.prepareStatement(sql1);
			PreparedStatement pstm2=con.prepareStatement(sql2);	

			ResultSet rs1=pstm1.executeQuery();
			ResultSet rs2=pstm2.executeQuery();

			rs2.next();
			rs1.next();

			String bookreference=rs1.getString(1);
			String surname=rs1.getString(3);
			Date date=rs1.getDate(4);

			String bookreference2=rs2.getString(1);
			String surname2=rs2.getString(3);
			Date date2=rs2.getDate(4);

			pw.print("<html><body>");

			pw.print("<h1><font color:red>Your surname is "+surname+"</h1>");
			pw.print("<h1> Your departure date is "+date+"</h1>");
			pw.print("<h1> Your booking reference id is "+bookreference+"</h1><br>");

			pw.print("<h1> Your surname is "+surname2+"</h1>");
			pw.print("<h1> Your departure date is "+date2+"</h1>");
			pw.print("<h1> Your booking reference id is "+bookreference2+"</font></h1>");

			pw.print("</body></html>");

		}
		catch(Exception e)
		{
			e.printStackTrace();
			pw.print("<html><body>");
			pw.print("<h1>Error page</h1>");
			pw.print("</body></html>");
		}


	}

}
