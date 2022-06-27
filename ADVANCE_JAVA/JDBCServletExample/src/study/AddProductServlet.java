package study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddProductServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		pw.println("<htlm><body><center>");
		
		pw.println("<form method='POST'>");
		pw.println("Enter the id:<input type='number' name='pid'/>");
		pw.println("<br />Enter product Name :<input type='text' name='pname'/>");
		pw.println("<br />Enter product Price :<input type='number' name='pprice'/>");

		pw.println("<br/><input type='submit' name='Add product'/>");
		
		pw.println("</form>");
		pw.println("</center></body></html>");
		pw.close();
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String pid=request.getParameter("pid");
		String pname=request.getParameter("pname");
		String pprice=request.getParameter("pprice");
		
		Dao dao=new Dao();
		dao.addProduct(Integer.parseInt(pid), pname, Integer.parseInt(pprice));
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html><body>");
		pw.println("<from action='show' method='GET'>");
		pw.println("<br /><input type='submit' value='show all products'/>");
		pw.println("</form></body></html>");
		pw.close();
	}

}














