
public class Main {

	public static void main(String[] args) {
		
		int i=0;
		fun(i);
		
	}

	private static void fun(int x) {
		
		if(x<5)
		{
			x = x+1;
			
			
			for(int p=0; p<x; p++)
			{
				System.out.print("*");
			}
			System.out.println( );
			fun(x);

			for(int p=0; p<x-1; p++)
			{
				System.out.print("*");
			}System.out.println( );
			
		}
	}

}

			
