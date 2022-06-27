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

@WebServlet("/Product")
public class DisplayProduct extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		DAO dao = new DAO();
		ResultSet rs = dao.getRows("select * from product");

		pw.println("<html><body>");
		pw.println("<h1 align='center'>WELCOME...!!!</h1>");
		pw.println("<form method='POST'>");
		pw.println("<center>ID<select name='pid'>");

		try {
			while (rs.next()) {

				pw.println("<option>" + rs.getInt(1) + "</option>");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		pw.println("</select>");
		pw.println("<br/> <br/><input type='submit' name='show' value='Show' />");

		pw.println("</center></form></body></html>");

		pw.close();
		pw.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("pid");
		int id1 = Integer.parseInt(id);
		
		DAO dao = new DAO();
		
		ResultSet rs = dao.getRows("select * from product where id=" + id1 + " ");
		response.setContentType("text/html");
	
		PrintWriter pw = response.getWriter();
		pw.println("<html><body>");
		pw.println("<form   action='Update' method='POST'>");
		pw.println("<table border='1'>");

		int id2 = 0;
		try {
			rs.next();
			id2 = rs.getInt(1);
			String name = rs.getString(2);
			int cost = rs.getInt(3);
			pw.println("<br/><tr><td>" + id2 + "</td><td>" + name + "</td><td>" + cost + "</td><tr>");

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		pw.println("ID : <input type='number' name='pid' value=" + id1 + " readonly ");
		pw.println("<br/><br/><br/> Update Name : <input type='text' name='pname' />");
		pw.println("<br/><br/>Update Cost:<input type='number' name='pcost' />");

		pw.println("<br/><input type='submit' value='Update' /><br/>");

		pw.println("</table></body></html>");

		pw.close();

	}

}
