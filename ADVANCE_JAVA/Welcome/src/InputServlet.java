

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InputServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		pw.println("<htlm><body img src=\"image.png\" style=\"background-color:#f7dad0;\"><br /><br /><br /><br /><br /><br /><br /><br /><center>");
		
		pw.println("<form action='second' method='post'/>");
		pw.println("Enter the Name:<input type='text' name='username'/>");
		pw.println("<br />Surname :<input type='text' name='surname'/>");
		pw.println("<br /><br />Male<input type='radio' name='gender' value='Male'/>");
		pw.println("Female<input type='radio' name='gender' value='Female'/>");

		pw.println("<br/><input type='submit' name='Submit'/>");
		
		pw.println("</form>");
		pw.println("</center></body></html>");
		
		
	}//end of method

}//end of class




















