
public class Main {
      public static void main(String [] args)
    		  {
    	  
    	  DQueue dqueue = new DQueue();
    	  dqueue.insertR(20);
    	  dqueue.insertR(28);
    	  dqueue.insertF(70);
    	  dqueue.insertF(88);
    	  dqueue.insertR(60);
    	  dqueue.removeR();
    	  dqueue.removeF();
		
    	  System.out.print(dqueue);
    	  System.out.print(dqueue.removeF());
    	  
    	  
	}
}
