package Q1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Update")
public class Update extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html></body bgcolor='grey'>");

		String name = request.getParameter("pname");
		String cost = request.getParameter("pcost");
		int price = Integer.parseInt(cost);
		String id = request.getParameter("pid");
		int id1 = Integer.parseInt(id);
		
		
		
		DAO dao = new DAO();
		dao.UpdateName(id1, name);
		dao.UpdateNameCost(id1, name, price);
		dao.UpdateNamePrice(id1, name, price);
		pw.println("<h1>Successfully Updated</h1>");
		
		
		pw.println("</body></html>");
		pw.close();
	}

}
