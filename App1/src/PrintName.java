import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

public class PrintName extends GenericServlet
{

    public PrintName()
    {
    }

    public void service(ServletRequest req, ServletResponse res)
        throws ServletException, IOException
    {
        String n = req.getParameter("ParName");
        PrintWriter pw = res.getWriter();
        pw.print("<html><body>");
        pw.print((new StringBuilder("<h1>hi")).append(n).append("</h1>").toString());
        pw.print("</body></html>");
    }
}
