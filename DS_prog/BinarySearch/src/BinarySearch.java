import java.util.Scanner;

public class BinarySearch {
	int [] arr;
	public BinarySearch(int size)
	{
		arr = new int [size];
	}

	public void accept_arr(int [] arr)
	{
		int i;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the number: ");
			arr[i] = sc.nextInt();
		}
	}

	public int BinarySearch(int key)
	{
		int low =0;
		int high = arr.length-1;
		int mid = (low+high)/2;
		while(arr[mid] != key && low<=high)
		{
			if(key < arr[mid])
				high = mid-1;
			else
				low =mid+1;
			mid=(low+mid)/2;
		}
		if(arr[mid]==key)
			return mid+1;
			else
				return -1;
		
		
	}
}
