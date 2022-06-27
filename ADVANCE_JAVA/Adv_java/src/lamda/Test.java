package lamda;

public class Test
{

	public static void main(String[] args)
	{
		inter i =()->{System.out.println("implementation of inter interface");};//inferring left hand side
		//i.aj();
		
		aj1(i);
		//aj1(()->{System.out.println("implementation of inter interface");});//inferring aj1 argument->what is there in argument of aj1
						//impossible to call line 21 aj1 method with argument Object(big O Object)
	}
	
	public static void aj1(Object obj)
	{
		//obj.aj();
		((inter)obj).aj();
	}

//	public static void aj1(Object obj)  //aj1 call karate time it is impossible to define which object 
//	{
//		((inter)obj).aj();
//	}

}


interface inter
{
	public void aj();


}