package study.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
	  response.setContentType("text/html");
	  PrintWriter pw = response.getWriter();
	  pw.println("<html><body>");
	  pw.println("<from method='POST'>");
	  pw.println("Enter a uname: <input type='text' name='uname'/>");
	  pw.println("<br /> Enter passwaord: <input type='password' name='password' />");
	  pw.println("<br /> <input type='submit' value='login'/>");
	  pw.println("</form>");
	  pw.println("</body></html>");
	  pw.close();
	  
    }
  
  @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  String uname = request.getParameter("uname");
	  String pwd = request.getParameter("password");
	  
	  HttpSession session =request.getSession();
	  if(session.isNew())
	  {
		  session.setAttribute("uname", uname);
		  RequestDispatcher rd = super.getServletContext().getRequestDispatcher("/Home");
		  rd.forward(request, response);
	  }
	}


}
