import java.util.Scanner;

public class Main {

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array= ");
		int Size =sc.nextInt();
		Student[] arr = new Student [Size];
		
		System.out.println("Enter the elements of array ");
		for (int j=0; j<arr.length; j++)
		{
			System.out.println("name, gender, RollNo, marks");
			String name = sc.next();
			String gender = sc.next();
			int RollNo = sc.nextInt();
			int marks = sc.nextInt();
		
			arr[j]= new Student(name, gender, RollNo, marks);
		}
		System.out.println("unsorted student are ");
		QuickSort.print(arr);
		
		QuickSort.Sort(arr, 0, arr.length-1);
		
		System.out.println(" sorted student with their respective age ");
		
		QuickSort.print(arr);
	}
		
	
}
