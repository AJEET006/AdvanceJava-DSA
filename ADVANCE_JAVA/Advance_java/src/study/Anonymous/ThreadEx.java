package study.Anonymous;

public class ThreadEx {

	public static void main(String[] args) {
		Runnable task = new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<10;i++)
					System.out.println("hello");
				
			}
		};
		//first thread
		new Thread(task).start();
		
		//second thread
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 20; i++) {
					System.out.println("hi");
				}
			}
		}).start();

	}//end of main

}//end of ThreadEx class
