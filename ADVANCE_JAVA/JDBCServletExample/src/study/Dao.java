package study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao {

	Connection con = null;
	public Connection myGetConnection()
	{
		

		try
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			String url ="jdbc:mysql://localhost:3306/db2";
			String uname = "root";
			String pwd = "aieee@12345";

			con = DriverManager.getConnection(url, uname, pwd);
		}
		catch(SQLException e)
		{
			System.out.println("the connection could not be made" +e);
		}
		return con;

	}
	
	
	public void addProduct(int id, String name, int price)
	{
		 con = myGetConnection();
		try
		{
			PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?)");
			pstmt.setInt(1,id); //1 is question mark 1
			pstmt.setString(2,name);//internlly single qoute added or not if null
			pstmt.setInt(3, price);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public ResultSet getRows(String sql)
	{

		 con = myGetConnection();
		ResultSet rs =null;
		Statement stmt;
		try {
			stmt = con.createStatement();
			rs=stmt.executeQuery(sql);

		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return rs;
	}
	
	public void Close()
	{
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}