package study.methodlocalinner;

public class Test3 {
	
	
	public void m1()
	{
		final int x=100;
		int y = 200;
		class LocalEx
		{
			int z =99;
			public void show()
			{
				System.out.println("z="+z+ " x="+x+" y="+y);
			}
		}//end of LocalEx class
		LocalEx obj = new LocalEx();
		obj.show();
	}// end of m1 method

	public static void main(String[] args) 
	{
		Test3 t3=new Test3();
		//LocalEx obj = t3.new LocalEx(); //not available outside the m1 method
		t3.m1();
		
	}

}
