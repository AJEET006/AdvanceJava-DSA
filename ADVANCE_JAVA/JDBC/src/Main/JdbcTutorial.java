package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcTutorial
{

	public static void main(String[] args) throws SQLException, IOException
	{
		Connection con=null;
		ResultSet rs =null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		int r;
		String name;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db2","root","aieee@12345");
			if(con!=null)
			{
				System.out.println("connection successful");
				stmt = con.createStatement();
				//read Query
				rs=stmt.executeQuery("select * from product");
				while(rs.next())
				{
					System.out.println("id of product ->"+rs.getInt(1));
					System.out.println("name of product ->"+rs.getString(2));
					System.out.println("Price of product ->"+rs.getInt(3));
				}
				pstmt=con.prepareStatement("update product set name=? where id=?");
				System.out.println("Enter the product id to modify");
				r=Integer.parseInt(br.readLine());
				System.out.println("enter the name which you want to set");
				name=br.readLine();
				pstmt.setInt(2, r);
				pstmt.setString(1, name);
				System.out.println(pstmt.executeUpdate());
				System.out.println("table updated");
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally
		{
			rs.close();
			con.close();
			stmt.close();
			pstmt.close();
			br.close();

		}
	}

}
