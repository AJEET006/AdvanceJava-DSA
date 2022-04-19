
public class Main {
     public static void main(String[] args)
      {
		
		Stack s1 = new Stack();
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.pop();
		s1.push(40);
		
		System.out.println(s1);
		
		Stack s2 = new Stack(15);
		
		for(int i=0; i<10; i++)
			s2.push(100);
		
		System.out.println(s2);
		//Stack s3 = new Stack(20);
        
        Stack s3 = s1.concat(s2);  
        System.out.println(s3);
		
		if(s1.equals(s2))
		{
			System.out.println("s1 and s2 are same...");
		}
		else
		{
			System.out.println("s1 and s2 are different...");
		}
	
	

      }
}