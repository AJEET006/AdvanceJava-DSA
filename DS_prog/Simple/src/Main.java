public class Main {
	public static void main(String [] args)
	{
	    int i=0;
	    fun(i);
	}
	
	
	
	private static void fun(int x)
	{
		if(x<5) 
	  {
		   x=x+1;
		   System.out.print(x); //forward recursion
		
		   fun(x);                //recursion call
		   
		 if(x<4)
		  {
			x=x+1;
			System.out.print(x);//reverse recursion
		  }
	   }
		  
		
	}

}
