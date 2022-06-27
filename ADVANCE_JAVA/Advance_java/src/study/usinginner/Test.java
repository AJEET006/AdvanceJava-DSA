package study.usinginner;

public class Test    //outer class
{

	private int data1=101;
	private int common = 344;


	public void display()
	{
		//System.out.println("data1 =" +data1+ " data2 ="+data2);//we can not access inner class attributes
		//for that we have to create object of inner class and then we can call that attribute
		System.out.println("data1 =" +data1+ " data2 ="+new User().data2);

	}
	
	class User       //inner class
	{
		private int data2=101;
		private int common = 144;
		public void show()
		{
			System.out.println("data2=" +data2+ " data1=" +data1);
			System.out.println("common of outer=" +common+ " common of inner=" +common);
			System.out.println("common of outer=" +Test.this.common+ " common of inner=" +this.common);

		}
	}//end of user

	public static void main(String[] args)
	{

		Test obj = new Test();

		//	User u = new User();
		//No enclosing instance of type Test is accessible.
		//Must qualify the allocation with an enclosing instance of type Test (e.g. x.new A() where x is an instance of Test).

		User u = obj.new User();
		u.show();
		//obj.show();

	}

}//end of test class
