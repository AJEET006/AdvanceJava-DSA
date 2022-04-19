
public class MergeSortedArray
{ 
	public static void Merge(int [] arr,int [] brr, int [] crr )
	{
		
		int i=0, j=0,k=0;
		while(i<arr.length && j<brr.length) 
		{
		if(arr[i] <= brr[j])
		{
			crr[k] = arr[i];
			i++;
			k++;
		}
		else
		{
			crr[k]=brr[j];
			j++;
			k++;
		}
		}
		if(i==arr.length)
		{
			while(j<brr.length)
			{
				crr[k] = brr[j];
				j++;
				k++;
			}
		}
		else
		{
			while(i<arr.length)
			{
				crr[k] = arr[i];
				i++;
				k++;
			}
		}
		}
		
	
   public static void print(int [] crr)
	{
		for (int i = 0; i < crr.length; i++) {  //n
			System.out.print(crr[i] + ", ");
		}
		System.out.println();		
	}

}
