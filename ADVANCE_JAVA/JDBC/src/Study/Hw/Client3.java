package Study.Hw;
import java.util.Scanner;

import Study.DAO;

public class Client3 {

	public static void main(String[] args) {
		DAO dao = new DAO();
		//Connection con =  dao.myGetConnection();
		System.out.println(dao.myGetConnection());
		Scanner sc = new Scanner(System.in);

		do 
		{
			System.out.println("\nenter dml command\n :>");
			System.out.println("1. update name of a given id");
			System.out.println("2. update price of given id");
			System.out.println("3. update both name and price of given id");
			System.out.println("4. delete a record of given");
			System.out.println("5. show only the info of row of given id");
			System.out.println("6. show all records");
			System.out.println("7. quit");
			int num =sc.nextInt();
			switch(num)
			{
			case 1:
			{				
				System.out.println("enter the id to update name");				
				int id = sc.nextInt();
				System.out.println("-------------------------------------------------------");
				System.out.println("enter the name to update name");
				String name = sc.next();
				dao.UpdateName(id, name);
				System.out.println("-------------------------------------------------------");

				break;
			}
			case 2:
			{				
				System.out.println("enter the id to update price");

				int id = sc.nextInt();
				System.out.println("-------------------------------------------------------");
				System.out.println("enter the newprice to update price");
				int price = sc.nextInt();
				dao.UpdatepPrice(id, price);
				System.out.println("-------------------------------------------------------");

				break;
			}
			case 3:
			{				
				System.out.println("enter the id to update price");
				System.out.println("-------------------------------------------------------");
				int id = sc.nextInt();
				System.out.println("enter the new product name to update");
				String name =sc.next();
				System.out.println("enter the newprice to update price");
				int price = sc.nextInt();
				dao.UpdateNamePrice(id,name,price);
				System.out.println("-------------------------------------------------------");

				break;
			}
			case 4:
			{				
				System.out.println("enter the id to delete a row");
				int id = sc.nextInt();
				System.out.println("-------------------------------------------------------");

				dao.deleteId(id);
				System.out.println("-------------------------------------------------------");

				break;
			}
			case 5:
			{			
				System.out.println("enter the id to show the row info");
				int num1 = sc.nextInt();
				System.out.println("-------------------------------------------------------");			
				//dao.ShowResultSet(dao.getRows("select * from product where id ="+num1));
				//dao.InfoOfRow(num1);
				dao.Info(num1);
				System.out.println("-------------------------------------------------------");
				break;
			}
			case 6:
			{
				System.out.println("-------------------------------------------------------");		

				dao.ShowResultSet(dao.getRows("select * from product"));

				System.out.println("-------------------------------------------------------");	
				break;
			}
			case 7:
				System.exit(0);

			}

			//sc.close();
		}while(true);

	}

}
