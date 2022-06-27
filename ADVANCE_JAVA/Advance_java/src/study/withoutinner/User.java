package study.withoutinner;

public class User 
{
	private int data2 = 101;
	//private new User1();
	
	private void show()
	{
		System.out.println("data2 ="+data2+ " data1 ="+new User1().getData1());
		
	}
	public static void main(String [] args)
	{
		User obj = new User();
		obj.show();
	}
	
}


class User1
{
	private int data1 = 101;

	int getData1() {
		return data1;
	}

	public void setData1(int data1) {
		this.data1 = data1;
	}
}