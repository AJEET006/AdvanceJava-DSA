package Q3;
//3.  	Create a database table  ----- Users
//Primary key  Username   ,  password , date 
//U insert values in the table from mysql client 
//
//  http://localhost:8080/AppHW2/login  GET  [HINT WRITE A SERVLET S4 that is mapped to url-pattern "login"  , add doGet  ]
//
//	this should show the uname password login screen
//	when USER enters the details and clicks login go to
// http://localhost:8080/AppHW2/login  POST    [HINT in S4, add doPost  ]
//		 in the doPost method 
//		Use the HashMap to verify if credentials are correct . If Correct show output as welcome user else show output as Invalid user.
//
//ADD  the init method to the Servlet  as follows ---
//	In the init method  -----
//             Fire a select query DAO  that fetches all records of Users table . Create a HashMap<String String>  in the servlet  class as a property.	  add all unames and passwords to the hashmap


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import hw.DAO;

@WebServlet("/Login")
public class Login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		pw.println("<html><body><center>");

		pw.println("<form  method='POST'>");

		pw.println("<br>Enter Username:<input type='text' name='Uname'/>");
		pw.println("<br>Enter Password:<input type='text' name='PWD'/>");
		pw.println("<br /><br /><br /><center> <input type='submit' value='submit'></center>");

		pw.println("</form>");

		pw.println("</center></body></html>");
		pw.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter pw = response.getWriter();

		DAO dao = new DAO();
		HashMap<String,String> hmp =dao.verify();
		String Uname=request.getParameter("Uname");
		String PWD=request.getParameter("PWD");

		if(hmp.containsKey(Uname))
		{
			String password = hmp.get(Uname);
			if(password.equals(PWD))
			{
				pw.println("logged in seccessfully!!");		
			}
			else
			{
				pw.println("password mismatch");
			}
		}

		else
		{	
			pw.println("Invalid user");

		}


		pw.close();	
	}

	@Override
	public void init() throws ServletException 
	{	
		DAO dao = new DAO();
		HashMap<String,String> hmp =new HashMap<>();
		ResultSet rs= dao.getRows("select * from Signup");
		try {
			while(rs.next())
			{
				hmp.put(rs.getString(4), rs.getString(5));
				//System.out.println(rs.getString(4)+"---"+rs.getString(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		for(String name : hmp.keySet())
		{
			System.out.println(name);
		}
	}
	

}





