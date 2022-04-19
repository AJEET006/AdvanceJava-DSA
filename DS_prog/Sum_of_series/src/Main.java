
public class Main {
	public static void main(String [] args)
	{
		int i=10;
	    int y=sum_Of_series(i);
	    System.out.println("sum = " + y);
	}
	
	private static int sum_Of_series(int x)
	{
		int sum;
		if(x==1)
		{
			return 1;
		   
		}
		
		sum=x+sum_Of_series(x-1);
		return sum;
	}

}
