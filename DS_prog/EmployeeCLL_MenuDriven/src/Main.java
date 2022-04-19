import java.util.Scanner;

public class Main {
	public static void main(String [] args)
	{
		CircularLL CLL = new CircularLL();
		Employee E1 = new Employee();
		Employee E2 = new Employee("Rahul", "YHTU789L", 78000); 
		Employee E3 = new Employee("Amit", "JKUYG89O", 90000); 
		Employee E4 = new Employee("Rakesh", "GHDEWS345P", 34000); 
		Employee E5 = new Employee("Arav", "LOPIU678J", 67000); 
		Employee E6 = new Employee("Abhinav", "MKLIU908W", 89000); 
		
		
		Scanner sc = new Scanner(System.in);
		do
		{
		System.out.println("Enter your choice :\n"
				+ "1.Insert\n"+ "2.Delete\n" + "3.Exit");
			int ch = sc.nextInt();
			if(ch==3)
			{
				break;
			}
			switch(ch)
			{
			case 1:
				do
				{
				System.out.println("Enter your insert type choice:\n"
						+"1.Insert\n"+ "2.Append\n"+ "3.Insert By Position\n"
						+"4.Exit");
				int choice = sc.nextInt();
				if(choice==4)
				{
					break;
				}
				switch(choice)
				{
				   case 1:
					   CLL.Insert(E1);
					   CLL.Insert(E2);
					   CLL.Insert(E3);
					   CLL.Insert(E4);
					   CLL.Insert(E6);
					   System.out.println(CLL);
					   break;
					   
				   case 2:
					   CLL.Append(E5);
					   CLL.Append(E4);
					   CLL.Append(E3);
					   System.out.println(CLL);
					   break;
				   
				   case 3:
					   CLL.InsertByPos(E5, 2);
					   CLL.InsertByPos(E2, 4);
					   System.out.println(CLL);
					   break;
					   default :
						   System.out.println("Enter your choice :");
				}
				}
				while(true);	
				System.out.println("Bye Bye.......");
				break;
				
			case 2:
				do
				{
				System.out.println("Enter your Delete choice:\n"
						+"1.Delete First\n"+ "2.Delete Last\n"+ "3.Delete By Position\n"
						+"4. Exit");
				int choice = sc.nextInt();
				if(choice==4)
				{
					break;
				}
				switch(choice)
				{
				   case 1:
					   CLL.deleteFirst();
					   CLL.deleteFirst();
					   System.out.println(CLL);
					   break;
					   
				   case 2:
					   CLL.deleteLast();
					   System.out.println(CLL);
					   break;
				   
				   case 3:
					   CLL.DelByPos(2);
					   System.out.println(CLL);
					   
					   break;
					   default :
						   System.out.println("Enter your choice :");
				}
				}
				while(true);	
				System.out.println("Bye Bye.......");
				
			}
		}
		while(true);	
		System.out.println("Bye Bye.......");
		sc.close();
	}
}
