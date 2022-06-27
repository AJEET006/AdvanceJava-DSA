package study.outerclass;

public class Test {
	 private int id=204;
	 private String name;
	  Ajeet a = new Ajeet();
	 public void show()
	 {
		 int id1=900;
		 System.out.println("id from Test ="+id+ " id2 from Ajeet ="+a.id2);
	 }
	
	
	

	public static void main(String[] args) 
	{
		Test s = new Test();
		s.show();
		Ajeet a = new Ajeet();
		a.sys();
		
		
	}

}
 class Ajeet
{
	public int id2=298;
	
	public void sys()
	{
		System.out.println("abc");
	}
}


