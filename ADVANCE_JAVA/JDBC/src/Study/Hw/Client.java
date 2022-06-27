package Study.Hw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Client {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/db2";
		String uname="root";
		String pwd ="aieee@12345";
		ResultSet rs =null;

		Connection con = DriverManager.getConnection(url,uname,pwd);
		Statement stmt = con.createStatement();
		//System.out.println(con);


		Scanner sc = new Scanner(System.in);

		int flag=0;
		do {
			System.out.println("Enter the passward");
			String pwd1 = sc.next();


			if(pwd1.compareTo("Ajeet@123")==0)
			{

				do
				{


					System.out.println("Enter you choice to execute DML commands :");
					System.out.println("1. Insert");
					System.out.println("2. Update");
					System.out.println("3. Delete");
					System.out.println("4. view");
					System.out.println("5. Quit");

					int ch = sc.nextInt();
					//char ch1 = sc.next().charAt(0);
					switch(ch)
					{

					case 1:
					{	
						System.out.println("-------------------------------------------------------------------------");
						System.out.println("enter the id :");
						int id = sc.nextInt();
						System.out.println("Enter the name of product :");
						String name = sc.next();
						System.out.println("Enter the price :");
						int price = sc.nextInt();
						String sql = "insert into product values("+id+",'"+name+"',"+price+")";
						stmt.executeUpdate(sql);
						System.out.println("record inserted in table\n");
						System.out.println("-------------------------------------------------------------------------");
						break;
					}
					case 2:
					{
						do 
						{
							System.out.println("Enter you choice to update in table :");
							System.out.println("1.update id\n 2.update name\n 3.update price\n 4.quit");
							int choice = sc.nextInt();
							switch(choice)
							{
							case 1:
							{
								System.out.println("-------------------------------------------------------------------------");
								System.out.println("enter the new id :");
								int id = sc.nextInt();

								System.out.println("enter the old id :");
								int id1 = sc.nextInt();
								String sql = "update product set id="+id+ " where id="+id1 ;
								stmt.executeUpdate(sql);
								System.out.println("record updated in table\n");
								System.out.println("-------------------------------------------------------------------------");
								break;
							}
							case 2:
							{
								System.out.println("-------------------------------------------------------------------------");
								System.out.println("enter the new name :");
								String name = sc.next();

								System.out.println("enter the old name :");
								String name1 = sc.next();
								String sql = "update product set name='"+name+ "' where name='"+name1+"'";
								stmt.executeUpdate(sql);
								System.out.println("record updated in table\n");
								System.out.println("-------------------------------------------------------------------------");
								break;
							}

							case 3:
							{
								System.out.println("-------------------------------------------------------------------------");
								System.out.println("enter the new price :");
								int price = sc.nextInt();

								System.out.println("enter the old price :");
								int price1 = sc.nextInt();
								String sql = "update product set price="+price+ " where price="+price1 ;
								stmt.executeUpdate(sql);
								System.out.println("record updated in table\n");
								System.out.println("-------------------------------------------------------------------------");
								break;
							}

							case 4:
								break;

							}

						}
						while(true);

					}	

					case 3:
					{
						System.out.println("-------------------------------------------------------------------------");
						System.out.println("enter the id :");
						int id = sc.nextInt();
						String sql = "delete from product where id="+id;
						stmt.executeUpdate(sql);
						System.out.println("record deleted from table\n");
						System.out.println("-------------------------------------------------------------------------");
						break;
					}
					case 4:
					{

						System.out.println("-------------------------------------------------------------------------");
						if(con!=null)
						{
							System.out.println("connection successful");
							stmt = con.createStatement();
							//read Query
							rs=stmt.executeQuery("select * from product");
							while(rs.next())
							{
								System.out.println("-------------------------------------------------------------------------");
								System.out.println("id of product :"+rs.getInt(1));
								System.out.println("name of product :"+rs.getString(2));
								System.out.println("Price of product :"+rs.getInt(3));
								System.out.println("-------------------------------------------------------------------------");
							}

						}
						System.out.println("-------------------------------------------------------------------------");
						break;

					}

					case 5:
						break;
					}


				}while(true);
			}
			else
			{
				flag++;
				if(flag==3)
				{
					System.out.println("no. of attempts are finished");
					break;
				}
				continue;
			}
		}while(true);

		//			con.close();
		//			stmt.close();
		//			rs.close();
		//			sc.close();

	}


}
