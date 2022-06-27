package Q1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//we use WebServlet annotation instead of web.xml 
@WebServlet("/show")
public class ShowServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		DAO dao = new DAO();
		ResultSet rs = dao.getRows("Select * from product");

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		pw.println("<html><body>");
		pw.println("<form action='Product' method='GET' >");
		pw.println("<table border='2'>");
		try {
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int cost = rs.getInt(3);
				pw.println("<tr><td>"+id+"</td><td>"+name+"</td><td>"+cost+"</td></tr>");

			}
			
		} catch (SQLException E) {
			E.printStackTrace();
		}
		pw.println("</table>");
		pw.println("<br/><input type='submit' value='Display Product' />");
		pw.println("</form></body></html>");
		pw.close();
		
		
		

	}

}
