
public class MergeSort {
	
	
	
	private static void Merge(int [] crr, int l, int m, int h)
	{
		int n1 = (m-l)+1;
		int n2 = h-(m+1)+1;
		
		int [] arr = new int [n1];
		int [] brr = new int [n2];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = crr[l+i];
		}
		for(int i=0; i<brr.length; i++)
		{
			brr[i] = crr[m+1+i];
		}
		
		int i=0, j=0,k=l;
		while(i < arr.length && j < brr.length) 
		{
		   if(arr[i] <= brr[j])
		    {
		      crr[k] = arr[i];
			  k++;
			  i++;
			  
		   }
		else
		  {
			crr[k]=brr[j];
			k++;
			j++;
			
		  }
		}
		if(i==arr.length)
		{
			while(j<brr.length)
			{
				crr[k] = brr[j];
				k++;
				j++;
				
			}
		}
		else
		{
			while(i<arr.length)
			{
				crr[k] = arr[i];
				k++;	
				i++;
				
			}
		}
	}
	
	public static void MergeSort(int [] crr, int l, int h)
	{
		if(l<h)
		{
			int m = (l+h)/2;
			
			MergeSort(crr, l , m);   //forward recursion
			MergeSort(crr, m+1 , h);  //forward recur
			Merge(crr, l, m, h);      //reverse recursion
			
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
