package study;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/Life",loadOnStartup=-1)
//loadonstartup  used for eager initialization
public class LifeCycleEX extends HttpServlet {

    public LifeCycleEX() {
		System.out.println("constructor of lifeCycle Ex called");
	}
 
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doGet method of lifeCycle Ex is called");
	
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("service method is called");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init method of lifeCycle is called");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy method of lifeCycle is called");

	}
}
