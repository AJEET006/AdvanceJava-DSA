
public class Main {

	public static void main(String [] args)
	{
		
		int [] arr1 = new int [] {2,3,24,26,96};
		int [] arr2 = new int [] {1,6,54,89,90,245};
		int [] crr = new int [arr1.length + arr2.length];
		
		MergeSortedArray.Merge(arr1, arr2, crr);
		MergeSortedArray.print(crr);
		
	
	}
		
	
}
