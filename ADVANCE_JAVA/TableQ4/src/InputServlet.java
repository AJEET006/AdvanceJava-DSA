

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InputServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pw =response.getWriter();
		
		pw.println("<html><body img src=\"image.png\" style=\"background-color:#c3e1ed;\"><center>");
		pw.println("<form action='input' method='post'");
		
		pw.println("<br /><br /><br /><br /><br /><b><font size=5>Enter number of rows you want: <input type='number' name='num'/><b/><font/>");
		pw.println("<br /><h3><input type='submit' value='TABLE'/><h3/>");
		
		pw.println("</form>");
		pw.println("</center></body></html>");
		pw.close();
	}

}