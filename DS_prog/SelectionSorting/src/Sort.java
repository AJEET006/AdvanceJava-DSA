

public class Sort {
       
	public static void selection(int [] arr)
	{
		for(int p=0;p<arr.length-1;p++)
		{
			int i=p;
			int x = arr[i];
			while(i<arr.length)
			{
				if(arr[i]<x)
				{
				  int temp = arr[i];
				  arr[i] = x;
				  x=temp;
					
				}
					i++;
			}arr[p]=x;
		}
	}
	
	public void print( int [] arr)
	{
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i] + ", ");
		}
	   System.out.println(); 
	
	
 }

	
	
}
