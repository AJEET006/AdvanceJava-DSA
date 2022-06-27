package study.InnerClass;

public  class Test
{
	private int num=900;
	private String common="Ajeet1";
	
	
	public void show()
	{
		 int id=879;
		 System.out.println("num1 ="+new Inner().num1);
//		 System.out.println("common ="+common+ " common ="+new Inner().common);
		 class Inner1
		 {
			 private int id1=666;
			 void display1()
			 {
				 System.out.println(id1);
			 }
		 }
		 
		 Inner1 i = new Inner1();
		 i.display1();
		
	}
	
	
	class Inner
	{
		private int num1=800;
		private int num=9;
		private String common="Ajeet2";
		
		
		public void Display()
		{
			System.out.println("num ="+Test.this.num+ " num1 ="+num1);
			System.out.println("common ="+Test.this.common+ " common ="+common);
		}
	}

	public static void main(String[] args)
	{
		
		//Inner i = new Inner();
		Test obj = new Test();
		//Inner obj1 = obj.new Inner();
		Inner obj2 = new Test().new Inner();
		//obj2.Display();
		obj.show();
		
		
		//Inner1 in =new Test().new Inner1();
	}

}
