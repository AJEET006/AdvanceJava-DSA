import java.util.Scanner;

public class Main {

	public static void main(String [] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array= ");
		int Size =sc.nextInt();
		int [] arr = new int [Size];
		
		System.out.println("Enter the elements of array ");
		for (int j=0; j<arr.length; j++)
		{
			int value = sc.nextInt();
			arr[j]= value;
		}
		
		QuickSort.print(arr);
		
		QuickSort.Sort(arr, 0, arr.length-1);
		
		QuickSort.print(arr);
	}
		
	
}
