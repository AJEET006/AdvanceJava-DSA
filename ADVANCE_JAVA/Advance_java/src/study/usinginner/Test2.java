package study.usinginner;

public class Test2 {
	
	private int x=20;
	private static int y=200;
	
	//it does not get this of outer class implicitly
	//only static properties can be accessed
	public static class Inner
	{
		private int a = 99;
		private static int b = 199;
		
		public void show()
		{
			System.out.println("x= not available" +" y="+y+ " a="+a+ " b="+b);
		}
		
	}//end of inner class
	
	
	

	public static void main(String[] args) {
	
			Inner obj = new Test2.Inner(); //outerclassname.Inner
			obj.show();
	}

}//end of outer class
