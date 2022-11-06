

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
 * Servlet implementation class Servletcon
 */
@WebServlet("/Servletcon")
public class Servletcon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servletcon() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String customerID = request.getParameter("customerID");


		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "12");
		
		PreparedStatement ps=con.prepareStatement("select * from customers where customerID=?");

		
		ps.setString(1,customerID);
		out.print("Updated details");

		out.println("<table width=50% border=1>");
		
		ResultSet rs=ps.executeQuery();
		ResultSetMetaData rsmd= rs.getMetaData();
		
		int totalColumn=rsmd.getColumnCount();
		out.print("<tr>");
		for(int i=1;i<=totalColumn;i++) {
			out.print("<th>"+rsmd.getColumnName(i)+"</th>");
		}
		out.print("<tr>");
	    while(rs.next())
		    {
		        out.print("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getInt(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getInt(7)+"</td><td>"+rs.getInt(8)+"</td></tr>");
		    }
		out.print("</table>");
		

		} 
		catch (Exception e) {
		out.println(e);
		}
		 

		

		//System.out.close();
	
	}

}
