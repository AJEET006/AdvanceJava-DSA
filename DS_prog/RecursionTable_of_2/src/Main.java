
public class Main {
	public static void main(String [] args)
	{
		int i=0;
		fun(i);
	}
	
	
	private static void fun(int x) 
	{
		if(x<10)
		{
			x=x+1;
			int p=(2*x);
			System.out.print("2*"+x+"="+p+"\n");
			fun(x);
		}
		
	}
	

}
