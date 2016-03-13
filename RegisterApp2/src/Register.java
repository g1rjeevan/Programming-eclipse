import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Register extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/jecm4";
		String user="root";
		String DBpass="java";
		Connection con=null;
		PrintWriter pw= resp.getWriter();
		String name=req.getParameter("parName");
		String email=req.getParameter("parEmail");
		String pass=req.getParameter("parPass");
		try{
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, DBpass);
			String sql="INSERT INTO register VALUES(?,?,?)";
			PreparedStatement pstm=con.prepareStatement(sql);
			pstm.setString(1, name);
			pstm.setString(2, email);
			pstm.setString(3, pass);
			pstm.executeUpdate();
			pw.print("<html><body>");
			pw.print("<h1>Thank you, your data is stored</h1>");
			pw.print("</body></html>");
		}
		catch(Exception e){
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
