//import java.util.Arrays;

public class Stack {

	private int []arr;
	private  static int top;
	
	public Stack()
	{
		this.arr = new int[5];
		this.top = -1;
		
	}
	
	public Stack(int size)
	{
		this.arr = new int[size];
		this.top = -1;	
	}
	
	public  void push(int x)
	{
		if(top < arr.length-1)//-1 < 4
		{
			top++; //0
			arr[top] = x; //arr[0] = 10
		}
		else
			System.out.println("Overflow...");
	}
	
	public int pop()
	{
		if(top != -1) //4 != -1
		{
			int x = arr[top];
			top--;
			return x;
		}
		else
			System.out.println("Underflow...");
		return 0;
	}

	
	
	public String toString() {

		String str = "";
		if(this.top == -1)
			str = "Stack is empty";
		else
		{
			for(int i=this.top; i>=0; i--)
				str = str + (this.arr[i])+", ";
		}

		return str;
	}
	
	public Stack concat(Stack s2)
	{
		Stack s3 = new Stack(this.arr.length + s2.arr.length);//5+7
		
			
		for(int i=0; i<=this.top; i++) //this means s1  //1. 0 < 4//2. 1 < 4
			//3. 2 < 4 //4. 3 < 4//5. 4 <= 4
		{
			s3.push(this.arr[i]); //1. s3.push(10) //2. s3.push(20)//3. s3.push(30)
			//4. s3.push(40)//5. s3.push(50)
		}
		
		for(int i=0; i<=s2.top;i++)//1. 0 < 6//2. 1 < 6
			//3. 2 < 6 //4. 3 < 6//5. 4 <= 6//6. 5 < 6//7. 6<=6
		{
			s3.push(s2.arr[i]);
		}
		return s3;
	}
	
public boolean equals(Stack x) {
		
		if(this.arr.length != x.arr.length) //s1 != s2
			return false;

		if(this.top != x.top)
			return false;


		//iterate on both arr and check each element
		for (int i = 0; i < this.top; i++) {

			if(this.arr[i] != x.arr[i])
			{
				return false;
			}
		}
		
		return true;
	}
}
