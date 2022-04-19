
public class CQueue {
	
	private int [] arr;
	private static int F = -1;
	private static int R = -1;
	
	
	public CQueue(int size)
	{
		this.arr = new int [size];
	}
	
	
	public void Insert(int value)
	{
		if(R+1==F || R==arr.length-1 && F==0 )
		{
			System.out.println("Cqueue is full");
		}
	   else
	   {
		  if(R!= arr.length-1)
		  
			  R++;
		else
		  R=0;
		  arr[R] = value;
			
		  if(F==-1)
			
				F++;
			
		}
	}
	public int Remove()
	{
		int value = 0;
		if(F == -1)
		{
			System.out.println("CQueue is empty");
		}
		else
		{
			value = arr[F];
		 if(F!=R)
			{
				if(F!=arr.length-1)
				{
					F++;
				}
				else
					F=0;
			}
		else
		  {
			F=R=-1;
		   }
		}
		return value;
	}
	public String toString()
	{
		String str ="";
		if(F == -1)
			str = "Queue is empty";
		else
		{
		for (int i =F; i!=R;)
		{
			str = str + arr[i] + ",";
			if(i != arr.length-1)
				i++;
			else
				i=0;
		}
		 str = str +arr[R] + ",";
	}
		return str;
	}
}










