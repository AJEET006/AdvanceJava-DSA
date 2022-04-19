import java.util.Scanner;

public class Main
{
	public static void main(String [] args) 
	{
		
	   int[] arr = new int [7];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++)
		{
			int n = sc.nextInt();
			arr[i]  = n;
		}
		HeapSort H = new HeapSort();
		//H.HeapSort(arr);
		HeapSort.printArray(arr);
		
	}
	
	
	
	
}


