package Q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
	public Connection myGetConnection() {

		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/ adv_java"; // Protocol : dbvendor://IP:portname/database
			String uname = "root";
			String pwd = "Sajet@1299";

			con = DriverManager.getConnection(url, uname, pwd);

		} catch (ClassNotFoundException | SQLException E) {
			System.out.println("The Connection Could Not be Made : " + E);
		}
		return con;
	}

	public ResultSet getRows(String sql) {

		Connection con = myGetConnection();
		ResultSet rs = null;
		Statement stmt;

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException E) {
			E.printStackTrace();
		}

		return rs;
	}

	public ResultSet givenID(int id) {

		ResultSet rs = null;
		PreparedStatement psmt = null;
		Connection con = myGetConnection();

		try {
			psmt = con.prepareStatement("select * from product where id=?");
			psmt.setInt(1, id);
			rs = psmt.executeQuery();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return rs;
	}
	public void UpdateNameCost(int id, String name, int cost) {
		Connection con = myGetConnection();
		PreparedStatement ps;
		{
			try {
				ps = con.prepareStatement("update product set name=?,cost=? where id=?");
				ps.setString(1, name);
				ps.setInt(3, id);
				ps.setInt(2, cost);
				ps.execute();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
}
