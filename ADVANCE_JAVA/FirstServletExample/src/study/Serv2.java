package study;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ser2")
public class Serv2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	int r=(Integer)request.getAttribute("counter");//upcasting
	String r1=request.getParameter("count");
	response.getWriter().append(" \nserv2 got counter as ="+r).append(" serv2 got count as ="+r1);
	
	ServletContext context = super.getServletContext();
	RequestDispatcher rd=context.getRequestDispatcher("/Ser3");
	r++;
	
	request.setAttribute("counter", r);//autoboxing
	//rd.forward(request, response);
	rd.include(request, response);
	}

	

}
