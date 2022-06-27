package Study;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcTxExample {

	public static void main(String[] args) throws SQLException
	{
		DAO dao = new DAO();
		Connection con = dao.myGetConnection();
		PreparedStatement pstmt = con.prepareStatement("update account set balance=? where accNo=?");
	try {
		con.setAutoCommit(false);
		pstmt.setInt(1, 8000);
		pstmt.setString(2, "1");
		pstmt.executeUpdate();
		System.out.println("first query succeeded.....");
		
		pstmt.setInt(3, 7000);//wrong question mark number
		pstmt.setString(2, "2");
		pstmt.executeUpdate();
		System.out.println("succeeded.....");
		con.commit();
	}catch(SQLException e)
	{
		System.out.println("failed.......");
		con.rollback();//rollback karna jaroori hain agar nahi kiya to upar ka second statement execute nahi hua fir bhi							
					   //first account ka data buffer me rahta hain aur wo koi bhi propt se commit kar sakta hain
	}
	
	}

}
