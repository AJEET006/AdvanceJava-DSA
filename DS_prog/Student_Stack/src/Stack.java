
public class Stack 
{

	private Student [] arr;
	private int pointer;

	
	public Stack()
	{
	  this.arr= new Student [5];
	  pointer=-1;
	}
	
	public Stack(int i)
	{
		this.arr=new Student [i];
		pointer = -1;
	}
	
	public void push(Student value)
	{
	   if(this.pointer< this.arr.length-1)
	   {
		   this.pointer++;
		   this.arr[this.pointer] = value;
	   }
	   else
		   System.out.println("overflow...........");
	}
	
	public Student pop ()
	{
		if(this.pointer != -1)
		{
			Student value = this.arr[this.pointer];
			this.pointer--;
			return value;
		}
		else
			System.out.println("underflow...........");
		return null;
	}
	public String toString()
	{
		String str = "";
		if(this.pointer == -1)
			str = "Stack is empty";
		else
		{
			for(int i=this.pointer; i>=0; i--)
				str = str + (this.arr[i] + ", ");
		}

		return str;
	}

	public boolean equals(Stack x) {
		
		if(this.arr.length != x.arr.length)
			return false;

		if(this.pointer != x.pointer)
			return false;

		for (int i = 0; i < this.pointer; i++) {

			if(this.arr[i] != x.arr[i])
			{
				return false;
			}
		}

		return true;
	}

}
	
