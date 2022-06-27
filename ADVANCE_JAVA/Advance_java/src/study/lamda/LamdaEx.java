package study.lamda;

public class LamdaEx {
		//lamda expression is .....
						//1.implementing interface
						//2.overriding method
						//3.creating object
	public static void main(String[] args) {
		Runnable r1 = ()->{System.out.println("hello");
			
			while(true)
			{
				System.out.println("hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		
		};
		Thread t1 = new Thread(r1);
		t1.start();
	}

}
