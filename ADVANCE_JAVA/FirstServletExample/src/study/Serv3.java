package study;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ser3")
public class Serv3 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int r=(Integer)request.getAttribute("counter");//upcasting
		String r1=request.getParameter("count");
		response.getWriter().append("\nserv3 got counter as ="+r);
		//response.getWriter().append(" serv3 got counter as ="+r++).append(" serv3 got count as ="+r1);
	}

}
