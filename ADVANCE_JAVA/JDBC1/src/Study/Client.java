package Study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/db2";
		String uname = "root";
		String pwd = "aieee@12345";
		
		Connection con = DriverManager.getConnection(url, uname, pwd);
		Statement stmt = con.createStatement();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id :");
		int id1 = sc.nextInt();
		System.out.println("Enter the name of product :");
		String name = sc.next();
		System.out.println("Enter the price :");
		int price = sc.nextInt();
		
		
		
		//String sql = "insert into product values("+id+",'"+name+"',"+price+")";
		//String sql = "update product set name='name' where id=24";
		String sql = "update product set id="+id1+" where id=24";
		
		stmt.executeUpdate(sql);
		System.out.println("record inserted");
		
		//System.out.println(con);
	}

}
