package study.Anonymous;

public class User {

	public static void main(String[] args)
	{
		I1 obj =new I1() {

			@Override
			public void doTask1() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public String doTask2() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void doTask3(int x) {
				// TODO Auto-generated method stub
				
			}
			
		};
	
		
		
		obj.doTask1();
		String a=obj.doTask2();
		System.out.println(a);
		obj.doTask3(45);

	}

}//end of User class


interface I1
{
	void doTask1();
	String doTask2();
	void doTask3(int x);
}//end of I1 interface

//
//class abc implements I1
//{
//
//	@Override
//	public void doTask1() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public String doTask2() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void doTask3(int x) {
//		// TODO Auto-generated method stub
//		
//	}
	
//}