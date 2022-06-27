package lamda;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {


		//implementation of functional interface as anonymous class
		//		Runnable r = new Runnable() {
		//			
		//			@Override
		//			public void run() {
		//				// TODO Auto-generated method stub
		//				
		//			}
		//		};




		Runnable r1 = ()->
		{

			//while(true)
			//{
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
				try {
					for (int i = 0; i < 5; i++)
					{
						Thread.sleep(1000);
						System.out.println("Runnable interface implemented");
					}

				}
				catch(Exception e)
				{
					System.out.println(e);
				};
			//}
		};

		new Thread(r1).start();

	}

}
