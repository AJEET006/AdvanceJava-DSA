package study.HW;

public class Test
{
	private int id;
	private String name;
	private int id1=500;
	
	public Test()
	{
		id=5;
		name="ajeet";
	}
	
	public Test(int id , String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public void x()
	{
		System.out.println("no argument method");
	}
	
	public void y(int arg,int arg2)
	{
		System.out.println("two Argument method :"+arg+","+arg2);
	}
	
	
	
}
