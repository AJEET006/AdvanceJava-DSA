package Study.Hw;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import Study.DAO;

public class TransactionPrac {

	public static void main(String[] args) throws SQLException     {
		DAO dao = new DAO();
		Connection con =dao.myGetConnection();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter account number");
		String accNo = sc.next();
		System.out.println("enter balance");
		int bal = sc.nextInt();
		try {
			PreparedStatement pstmt = con.prepareStatement("update account set balance=? where accNo=?");
			con.setAutoCommit(false);
			pstmt.setInt(1, bal);
			pstmt.setString(2, accNo);
			pstmt.executeUpdate();
			System.out.println("first query succeeded.....");
			
			
			
			System.out.println("enter account number");
			String accNo1 = sc.next();
			System.out.println("enter balance");
			int bal1 = sc.nextInt();
			PreparedStatement pstmt1 = con.prepareStatement("update account set balance=? where accNo=?");
						
			pstmt1.setInt(3, bal1);//wrong question mark number
			pstmt1.setString(2, accNo1);
			pstmt1.executeUpdate();
			System.out.println("second query succeeded.....");
			con.commit();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Failed ...........");
			
				con.rollback();
			
		}

	}

}