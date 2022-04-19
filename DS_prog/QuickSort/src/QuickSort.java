
public class QuickSort
{
	int [] arr;
	
	 
	private static int Partition(int [] arr, int l, int h)
	{
		int j = l;
		int i = l-1;
		int p = h;
		while(j!=p) 
		{
		if(arr[j] < arr[p])
		{
			i++;
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			
		}
		j++;
		}
		i++;
		int temp = arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
			
		  return i;
		}
	
	public static void Sort(int [] arr, int l, int h)
	{
		
		if(l<h)
		{
			int Pivot = Partition(arr , l , h);
			Sort(arr, l, Pivot-1);
			Sort(arr, Pivot+1, h);
		}
		
	}
	
   public static void print(int [] arr)
	{
		for (int i = 0; i < arr.length; i++) {  //n
			System.out.print(arr[i] + ", ");
		}
		System.out.println();		
	}

}
