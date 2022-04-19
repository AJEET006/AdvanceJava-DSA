
public class Stack {

	private int [] arr;
  private int top = -1;
	
	
	public Stack()
	{
		this.arr = new int [5];
		this.top = -1;
	}
	
	public Stack(int Size)
	{
	    this.arr = new int [Size];	
	    this.top= -1;
	}
	
	public void push(int value)
	{
		if(this.top<=this.arr.length-1)
		{
			this.top++;
			this.arr[this.top] = value;
		}
		else
		{
			System.out.println("stack is overflow");
			
		}
		
	}
	public  int pop()
	{
		if(this.top!=-1)//
		{
			int value = this.arr[this.top];
			this.top--;
			return value;
		}
		else
			
		{
			System.out.println("stack is underflow");
			return 0;
		}
	}
//	public Stack concat(Stack s1)
//	{
//		int t1 = this.top;
//		int t2 = s1.top;
//		for(int i=0;i<t2;i++)
//		{
//			this.arr[++t1]=s1.arr[i];
//		}return this;
//	}
	public Stack concat(Stack s2)
    {
	     Stack s3 = new Stack(this.arr.length + s2.arr.length);
	     for(int i=0;i<=this.top;i++)
	     {
	    	  s3.push(this.arr[i]);
	     }              
	     for(int i=0;i<=s2.top;i++)
	     {
	    	  s3.push(s2.arr[i]);
	     }
	 	return s3;
    }
	

	public String toString()
	{
		String str = "";
		if(this.top == -1)
			str = "Stack is empty";
		else
		{
			for(int i=this.top; i>=0; i--)
				str = str + (this.arr[i] + ", ");
		}

		return str;
	}

	public boolean equals(Stack x) {
		
		if(this.arr.length != x.arr.length)
			return false;

		if(this.top != x.top)
			return false;

		for (int i = 0; i < this.top; i++) {

			if(this.arr[i] != x.arr[i])
			{
				return false;
			}
		}

		return true;
	
 }
}