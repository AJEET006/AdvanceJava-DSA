
public class DQueue {
	private int [] arr;
	private int F;
	private int R;
	
	
	public DQueue()
	{
		this.arr = new int [5];
		this.F = -1;
		this.R = -1;
	}
	
	
	public DQueue(int size)
	{
		this.arr = new int [size];
		this.F = -1;
		this.R = -1;
	}
	
	public void insertF(int value)
	{
		if(F==0 && R==arr.length-1)
		{
			System.out.println("DQueue is full");
		}
		else 
		{
			if(F !=0)
			{
				F--;
				arr[F]=value;
			}
			else if(F==-1)
			{
				F=R=0;
			}
			else
			{
				R++;
				for(int x=R;x>F;x--)
				{
					arr[x] = arr[x-1];
				}
				arr[F] = value;
			}
		}
	}
	
	public void insertR(int value)
	{
		if(F==0 && R==arr.length-1)
		{
			System.out.println("DQueue is full");
		}
		else
		{
			if(F==-1)
			{
				F=R=0;
			}
			else if(R!=arr.length-1)
			{
				R++;
				arr[R] = value;
			}
			else
			{
				F--;
				for(int x=F;x<R;x++)
				{
					arr[x]=arr[x+1];
				}
				arr[R] = value;
			}
		}
	}
	
	public int removeR()
	 {
		 int value=0;
		 if(R!=-1)
		 {
			 value = arr[R];
			 if(F!=R)
			 {
				 R--;
			 }
			 else
				 F=R=-1;
		 }
		 else
			 System.out.println("Queue is empty");
		 return value;
	 }
	
	
	public int removeF()
	 {
		 int value=0;
		 if(F!=-1)
		 {
			 value = arr[F];
			 if(F!=R)
			 {
				 F++;
			 }
			 else
				 F=R=-1;
		 }
		 else
			 System.out.println("Queue is empty");
		 return value;
	 }
	
	 public String toString()
	 {
		 String str = "";
		 if(F==-1)
			 str="Queue is empty";
		 else
			 for(int i=F;i<=R;i++)
			 {
				 str = arr[i]+ ",";
			 }
	 return str;
	 }
}
