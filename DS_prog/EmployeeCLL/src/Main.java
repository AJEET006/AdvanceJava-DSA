
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
		
		CLL.Insert(E1);
		CLL.Insert(E2);
		CLL.Insert(E3);
		CLL.Insert(E4);
		CLL.Append(E5);
		//CLL.deleteFirst();
		
		//CLL.Insert(E5);
	   System.out.println(CLL);
	 
		
		
//		CLL.InsertByPos(E6, 1);
//		System.out.println(CLL);
	
		CLL.DelByPos(4);  
		System.out.println(CLL);

	}
}
