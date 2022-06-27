
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DAO {
	public Connection myGetConnection() {

		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/db2"; 
			String uname = "root";
			String pwd = "aieee@12345";

			con = DriverManager.getConnection(url, uname, pwd);

		} catch (ClassNotFoundException | SQLException E) {
			System.out.println("The Connection Could Not be Made : " + E);
		}
		return con;
	}
	

	public void Signup(String name,String Gender,int Mob,String uname,String pwd)
	{
		Connection con = myGetConnection();
		try
		{
			PreparedStatement pstmt = con.prepareStatement("insert into Signup values(?,?,?,?,?)");
			
			pstmt.setString(1,name);//internlly single qoute added or not if null
			pstmt.setString(2,Gender);

			pstmt.setInt(3, Mob);
			pstmt.setString(4,uname);
			pstmt.setString(5,pwd);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Signin(String uname,String pwd)
	{
		Connection con = myGetConnection();
		try
		{
			PreparedStatement pstmt = con.prepareStatement("insert into Signin values(?,?)");
			
			pstmt.setString(1,uname);
			pstmt.setString(2,pwd);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
