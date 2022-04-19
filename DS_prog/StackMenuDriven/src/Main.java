import java.util.Scanner;

/*Q1.Stack implementation
	1. input size of stack from user.

	2.Write menu driven operation
  	 push(),pop(),equals()

	3.implement two stack s1 and s2.

	4.concat two stack
	Stack s3=s1.concat(s2);
	System.out.println(s3);

	5.check Stack s1 and s2 are same or different*/


public class Main {

  public static void main(String []args)
  {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the First stack size:");
	  int size = sc.nextInt();
	  Stack s1 = new Stack(size);
	  System.out.println("Enter the First stack ("+size+") elements:");
	  System.out.println("What do you want:"+"\n1.PUSH"+"\n2.POP");
	  int ch =sc.nextInt();
	  switch(ch)
	  
	  {
	  
	  case 1:
	       System.out.println("No. of times PUSH the element:");
	       int n = sc.nextInt();
	       if(n<=size) {
		   for(int i=0; i<n; i++)
	       {
		   System.out.println("Push the elements:");
		   int ele = sc.nextInt();
		   s1.push(ele);
	       }
	       }
	       else 
	       {
	    	   System.out.println("\nOverflow");
	       }
	       
	  case 2:
		   System.out.println("No. of times POP the element:");
	       int m = sc.nextInt();
		   if(m<=size) {
	       for(int i=0; i<m; i++)
	       {
		   s1.pop();
	       }
	       }
		   else 
	       {
	    	   System.out.println("\nUnderflow");
	       }
		   System.out.println("After push/pop operation Your First stack elements are:");
		   System.out.println(s1+"\n\n");
	  break; 
	  default:
		  System.out.println("Exit...");
	  }
	  
	  System.out.println("Enter the second stack size:");
	   size = sc.nextInt();
	  Stack s2 = new Stack(size);
	  System.out.println("Enter the First stack ("+size+") elements:");
	  System.out.println("What do you want:"+"\n1.PUSH"+"\n2.POP");
	   ch =sc.nextInt();
	  switch(ch)
	  
	  {
	  
	  case 1:
	       System.out.println("No. of times PUSH the element:");
	       int n = sc.nextInt();
	       if(n<=size) {
		   for(int i=0; i<n; i++)
	       {
		   System.out.println("Push the elements:");
		   int ele = sc.nextInt();
		   s2.push(ele);
	       }
	       }
	       else 
	       {
	    	   System.out.println("\nOverflow");
	       }
	       
	  case 2:
		   System.out.println("No. of times POP the element:");
	       int m = sc.nextInt();
		   if(m<=size) {
	       for(int i=0; i<m; i++)
	       {
		   s2.pop();
	       }
	       }
		   else 
	       {
	    	   System.out.println("\nUnderflow");
	       }
		   System.out.println("After push/pop operation Your First stack elements are:");
		   System.out.println(s2+"\n\n");
	  break; 
	  default:
		  System.out.println("Exit...");
	  }
	  
	  System.out.println("After Concatinated result is: ");
	  
	  Stack s3 = s1.concat(s2);
	  
	  System.out.println(s3); //???
	  
	  if(s1.equals(s2))
			System.out.println("\n\nStack s1 and s2 are having same elements...");
		else
			System.out.println("\n\nStack s1 and s2 are having different elements...");
  }
}