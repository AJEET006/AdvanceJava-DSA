
public class Main {
	
	static int [] arr;
	static int topIndex=-1;
        public static void main(String [] args)
        {
        	arr =new int[5];
        	push(10);
        	push(20);
        	push(30);
        	pop();
        	push(40);
        	pop();
        	push(50);
        	//push(80);   //overflow condition
        	pop();
        	
        	
        	//pop(); 
        	print();
        	
        }
	private static void print()
	{
		for(int i=topIndex;i>=0;i--)
		{
			System.out.print(arr[i]+ ", ");
		}
	}
	
	private static int pop()
	{
		if(topIndex != -1)
		{
		int value = arr[topIndex];
		topIndex--;
		//System.out.println(value);
		return value;
		}
		else
			System.out.println("underflow........");
	       return 0;
	}
	
	
	private static void push(int value)
	{
		if(topIndex<arr.length-1)
		{
			topIndex++;
			arr[topIndex] = value;
		}
		else
			System.out.println("overflow............");
	}
	
}
