package Q2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Delete")
public class Delete extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");

		DAO dao = new DAO();
		PrintWriter pw = response.getWriter();

		String id = request.getParameter("pid");
		int id1 = Integer.parseInt(id);

		dao.deleteRecord(id1);
		pw.println("<h3>Record deleted</h3>");
		pw.close();
	}

}
