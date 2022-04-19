import java.util.Scanner;

public class Main {
	public static void main(String [] args)
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		num = sc.nextInt();
		long f=fact(num);
		System.out.println(f);
	}
	
	private static long fact(int x)
	{
		if(x==0)
	   	return 1;
		 
		return (x*fact(x-1));
	}

}
