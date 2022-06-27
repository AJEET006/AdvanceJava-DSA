package study;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ser1")
public class Serv1 extends HttpServlet {
   
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int count=Integer.parseInt(request.getParameter("count"));
		count++;
		response.getWriter().append("\nserv1 got count as="+count);
		
		ServletContext context = super.getServletContext();
		RequestDispatcher rd=context.getRequestDispatcher("/Ser2");
		request.setAttribute("counter", count);//autoboxing
		//rd.forward(request, response);
		rd.include(request, response);
	}

	

}


/* request.setAttribute("counter", count);//autoboxing and upcasting -----
				here count is an object of integer type....sutoboxing is happening here
				----if we want to extract that integer value then we have to upcast in Integer 
				
*/				
//maja doka(Deemag) kharab jhala				
