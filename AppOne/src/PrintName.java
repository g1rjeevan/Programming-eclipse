import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class PrintName extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String n=req.getParameter("parName");
		PrintWriter pw=resp.getWriter();
		pw.print("<html><body>");
		pw.print("<h1> Hi"+n +"</h1>");
		pw.print("</body></html>");
	}
}
