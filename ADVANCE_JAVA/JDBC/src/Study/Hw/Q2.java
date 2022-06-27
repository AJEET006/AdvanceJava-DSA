package Study.Hw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;



public class Q2 {

	public static void main(String[] args)
	{
		Connection con = null;
		Scanner sc = new Scanner(System.in);


		try
		{
			String url ="jdbc:mysql://localhost:3306/db2";
			String uname = "root";
			String pwd = "aieee@12345";

			con = DriverManager.getConnection(url, uname, pwd);
			String sql=("select name from product");
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			//-------------------------------------------------------------------------------------------------------
			ArrayList<String> name1= new ArrayList<String>();

			while(rs.next())
			{
				name1.add(rs.getString("name"));

				System.out.println(rs.getString("name")); 
				//System.out.println(rs);
			}
			
			
			System.out.println("------------------------------");
			System.out.println("size of arraylist :"+name1.size());
			System.out.println("------------------------------");
			
			
			
			System.out.println("names in the Arraylist :->");						
			for (String str1 : name1)
			{			
				System.out.println(str1);
				//if(str1.compareToIgnoreCase(str)==0)
				//{
				//	System.out.println("Given Product_Name is present in the table");
				//}		
			}
			System.out.println("------------------------------");

				System.out.println("Enter the product name :");
				String str = sc.next();
				System.out.println("------------------------------");
				if(name1.contains(str))
				{
					System.out.println("Given Product_Name is present in the table");
				}
				else
				{
					System.out.println("Given Product_Name is not present in the table");
				}
			System.out.println("------------------------------");
			
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}


	}



}


