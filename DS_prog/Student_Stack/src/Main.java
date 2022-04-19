import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Stack studentStack = new Stack();
		Student s1 = new Student("Pankaj", 30, 'M');
		Student s2 = new Student("ajeet", 27, 'M');
		Student s3 = new Student("Sugandha", 26, 'F');
		Student s4 = new Student("Sanket", 25, 'M');
		Student s5 = new Student("Sonali",24 , 'F');
		//Student s6 = new Student("Snehal",30, 'F');
		
		
		studentStack.push(s1);
		studentStack.push(s2);
		studentStack.push(s3);
		studentStack.push(s4);
		studentStack.push(s5);
		//studentStack.push(s6);
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the student from 1 to 5");
		int choice = sc.nextInt();
		
		if(choice==0||choice>5)
		{
			System.out.println("enter correct student");
			choice = sc.nextInt();
		}
		
		switch (choice)
		{
		case 1: 
			
			studentStack.pop();
			Student popStudent = studentStack.pop();
			System.out.println(popStudent.name);
			System.out.println("enter your choice");
			choice = sc.nextInt();
			//break;
			
		case 2:
			
			
			studentStack.pop();
			Student popStudent1 = studentStack.pop();
			System.out.println(popStudent1);
			System.out.println("enter your choice");
			choice = sc.nextInt();
			//break;
		case 3:
			
			studentStack.pop();
			Student popStudent3 = studentStack.pop();
			System.out.println(popStudent3);
			System.out.println("enter your choice");
			choice = sc.nextInt();
			//break;
			
 
	    case 4:
	    	
			studentStack.pop();
			Student popStudent4 = studentStack.pop();
			System.out.println(popStudent4);
			System.out.println("enter your choice");
			choice = sc.nextInt();
			//System.out.println(popStudent4.name);
		//	break;
			
		case 5:
			
			
			studentStack.pop();
			Student popStudent5 = studentStack.pop();
			System.out.println(popStudent5);
			System.out.println("enter your choice");
			choice = sc.nextInt();
			
			//break;
		/*
		 case 6:
			
			System.out.println("wrong input enetr the student number from 1 to 5");
			break;
        */

		}
	
	}
	
}

		
		
		