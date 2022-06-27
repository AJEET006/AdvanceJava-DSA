package study.lamda;

public class SimpleLambda {

	public static void main(String[] args) {

		//this is the class definition that implements the interface method
		I1 obj1 = ()->{System.out.println("test I1");};
		I2 obj2 = (p1,p2)->{System.out.println("i got "+p1+ " , "+p2);};
		I3 obj3 = (p)->{return new Student(p,"ajeet");};



		//obj1.m1();
		obj2.m2(true, 'A');
		obj2.m2(false, 'A');
		Student s = obj3.process(89);
		System.out.println(s);

		test(obj1);
		test( ()->{System.out.println("this is another print");});
	}






 static void test(I1 obj1)
	{
		obj1.m1();

	}
}
@FunctionalInterface
interface I1
{
	void m1();
}

@FunctionalInterface
interface I2
{
	void m2(boolean x,char ch);
}

@FunctionalInterface
interface I3
{
	Student process(int p);
}
