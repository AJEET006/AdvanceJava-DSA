

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class WelcomeServlet extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String s=request.getParameter("surname");
		String u=request.getParameter("username");		
		String g=request.getParameter("gender");
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		pw.println("<html><body img src=\"image.png\" style=\"background-color:#f7dad0;\"<br /><br /><br /><br /><br /><br /><center>");
		
		if(g.equals("Male"))
		{
			pw.println("<h1>Mr. "+u+" "+s+"</h1>");
		}
		else
		{
			pw.println("<h1>Madam "+u+" "+s+"</h1>");
		}
		pw.println("</center></body></html>");
	}

}












