package com.g1;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class UScurrency extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException {
		String m=req.getParameter("parMoney");
		int amt=Integer.parseInt(m);
		resp.setContentType("text/html");
		ServletConfig ref=getServletConfig();
		String s=ref.getInitParameter("dollor");
		double present=Double.parseDouble(s);
		double value=(double)amt/present;
		PrintWriter pw=resp.getWriter();
		pw.print("<html><body>");
		pw.print("<h1> US currency is $ "+value+"</h1>");
		pw.print("</body></html>");
	}

}
