package study.Reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.stream.Collector;

public class Example2 {



	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Class name");
		Class c1 = Class.forName(sc.next());

		System.out.println("the class is "+c1.getName());

		Constructor ctor = c1.getDeclaredConstructor(null);
		Object obj = ctor.newInstance();

		Constructor ctor1 = c1.getDeclaredConstructor(String.class, int.class);
		Object obj1 = ctor1.newInstance("new year celebration",60);


		Field[] properties = c1.getDeclaredFields();

		for(Field property : properties)
		{


			property.setAccessible(true);
			System.out.println("obj "+property.getName()+ " : "+property.get(obj));
			System.out.println("obj1 "+property.getName()+ " : "+property.get(obj1));





			System.out.println("enter the method name to call");

			String mname = sc.next();
			Method method = c1.getDeclaredMethod(mname);
			method.invoke(obj); //calling the specified method using a specific object
			method.invoke(obj1);
			

		}

	}//end of example2

	class SocialEvent
	{
		private String eventName;
		private int numberOfPeople;

		public SocialEvent()
		{
			eventName="birthday party";
			numberOfPeople=10;
		}


		public SocialEvent(String en,int num)
		{
			eventName=en;
			numberOfPeople=num;
		}

		public void show()
		{
			System.out.println("eventName ="+eventName+ ":"+ " numberOfPeople ="+numberOfPeople);
		}

		public String getname()
		{
			return this.eventName;
		}
		public int getnOfPeople()
		{
			return this.numberOfPeople;
		}
	}
}
