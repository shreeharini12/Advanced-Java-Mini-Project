

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servletcon1
 */
@WebServlet("/Servletcon1")
public class Servletcon1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int CardNumber=Integer.parseInt(request.getParameter("CardNumber"));
		int Validity=Integer.parseInt(request.getParameter("Validity"));
		String CardHolderName=request.getParameter("CardHolderName");
		int SecurityCode=Integer.parseInt(request.getParameter("SecurityCode"));
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "12");
			PreparedStatement ps=con.prepareStatement("insert into payment values(?,?,?,?)");
			
			ps.setInt(1,CardNumber);
			ps.setInt(2, Validity);
			ps.setInt(4, SecurityCode);
			ps.setString(3,CardHolderName);
			ps.executeUpdate();
			ps.close();
			con.close();
			out.print("Thank You! .. Your Payment is Successful");
		}
		catch(Exception e) {
			out.print(e);
		}
	}
		
}
//
//
//
