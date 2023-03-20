package Study;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;


public class DAO //data access object
{
	public Connection myGetConnection()
	{
		Connection con = null;

		try
		{
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

	public ResultSet getRows(String sql)
	{

		Connection con = myGetConnection();
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

	public void ShowResultSet(ResultSet rs)
	{
		try {
			while(rs.next()) 
			{
				int pid = rs.getInt("id");
				String pname = rs.getString("name");
				int price = rs.getInt(3);
				System.out.println("row number : "+rs.getRow() +"->"+pid+","+pname+","+price);
				//System.out.println(pname);
			}
		}catch(SQLException e)
		{
			System.out.println("problem in showing resultSet :"+e);
		}
	}
	//--------------------------------------------------------------------------------	
	

	public void addProduct(int id, String name, int price)
	{
		Connection con = myGetConnection();
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

	public void UpdatepPrice(int id,int price)
	{
		Connection con = myGetConnection();
		try
		{
			PreparedStatement pstmt = con.prepareStatement("update product set price=? where id=?");
			pstmt.setInt(1,price); //1 is question mark 1	
			pstmt.setInt(2, id);
			pstmt.executeUpdate();
			System.out.println("price update");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteId(int id)
	{
		Connection con = myGetConnection();
		try
		{
			PreparedStatement pstmt = con.prepareStatement("delete from product where id=?");
			pstmt.setInt(1,id); //1 is question mark 1			
			pstmt.executeUpdate();
			System.out.println("record deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void callgetName(int id)
	{
		Connection con = myGetConnection();
		try {
			//CallableStatement cstmt = con.prepareCall("call hi()");
			CallableStatement cstmt = con.prepareCall("{call getName(?,?)}");

			cstmt.registerOutParameter(2,Types.VARCHAR);
			cstmt.setInt(1, id);
			cstmt.execute();

			String msg = cstmt.getString(2);
			System.out.println("you got :"+msg);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void callgetN(int id,int price)
	{
		Connection con = myGetConnection();
		try {
			//create procedure getN(in u_id int ,in u_price int,out u_name varchar(20))
			CallableStatement cstmt = con.prepareCall("{call getN(?,?,?)}");

			cstmt.registerOutParameter(3,Types.VARCHAR);
			cstmt.setInt(1, id);
			cstmt.setInt(2, price);
			cstmt.execute();

			String msg = cstmt.getString(3);
			System.out.println("you got :"+msg);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteId1(int id)
	{
		Connection con = myGetConnection();
		Statement stmt;
		try
		{
			stmt = con.createStatement();
			String sql=("delete from product where id="+id);			
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void UpdateName(int id,String name)
	{
		Connection con = myGetConnection();
		try
		{
			PreparedStatement pstmt = con.prepareStatement("update product set name=? where id=?");
			pstmt.setInt(2,id); //1 is question mark 1	
			pstmt.setString(1,name);
			pstmt.executeUpdate();
			System.out.println("table updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void UpdateNamePrice(int id,String name,int price)
	{
		Connection con = myGetConnection();
		
		try {
			PreparedStatement pstmt = con.prepareStatement("update product set name=?,price=? where id=?");
			pstmt.setInt(3, id);
			pstmt.setString(1, name);
			pstmt.setInt(2, price);
			pstmt.executeUpdate();
			System.out.println("table updated");
			} 
		catch (SQLException e)
		{			
			e.printStackTrace();
		}
	}
	
	public void InfoOfRow(int id)
	{
		Connection con = myGetConnection();
		try
		{
			CallableStatement cstmt = con.prepareCall("{call getInfo(?,?,?,?)}");
			
			cstmt.registerOutParameter(2,Types.INTEGER);
			cstmt.registerOutParameter(3,Types.VARCHAR);
			cstmt.registerOutParameter(4,Types.INTEGER);
			cstmt.setInt(1, id);
			
			cstmt.execute();

			int msg = cstmt.getInt(2);
			String msg1 = cstmt.getString(3);
			int msg2 = cstmt.getInt(4);
			System.out.println("you got :"+msg+","+msg1+","+msg2);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void Info(int id)
	{
		Connection con = myGetConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement("select * from product where id=?");
			pstmt.setInt(1, id);
			ResultSet rs=pstmt.executeQuery();
			
			if(rs.next())
			{
				System.out.println("Id ->"+rs.getInt(1));
				System.out.println("Name ->"+rs.getString(2));
				System.out.println("price ->"+rs.getInt(3));
			}
			else
			{
				System.out.println("entered wrong id");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
