package Study;

import java.sql.ResultSet;

public class Client2 {

	public static void main(String[] args) {

		DAO dao = new DAO();
		ResultSet rs = dao.getRows("select * from product");
		dao.ShowResultSet(rs);

//		ResultSet rs1 = dao.getRows("select * from product where price<200");
//		System.out.println("product with price less than 200 :");
//		dao.ShowResultSet(rs1);
//
		System.out.println("--------------------------------------------");
		dao.addProduct(7, "mouse", 150);
		dao.ShowResultSet(dao.getRows("select * from product"));	
		System.out.println("--------------------------------------------");
		dao.UpdatepPrice(7,700);
		dao.ShowResultSet(dao.getRows("select * from product"));
		
		System.out.println("--------------------------------------------");
		
		dao.ShowResultSet(dao.getRows("select * from product"));
		System.out.println("--------------------------------------------");
		dao.callgetName(4);
		System.out.println("--------------------------------------------");
		dao.callgetN(3, 56);
		System.out.println("--------------------------------------------");
		dao.deleteId1(7);
		dao.ShowResultSet(dao.getRows("select * from product"));
		System.out.println("--------------------------------------------");

		dao.getRows("select * from product where id=3");
	}
}
