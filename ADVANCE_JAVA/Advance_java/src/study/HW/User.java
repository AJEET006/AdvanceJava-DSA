package study.HW;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class User {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the class name :");
		//String s = sc.next();
		Class c =Class.forName(sc.next());
		System.out.println(c);
		
		
//		Field f1 = c.getDeclaredField("id1");
//		f1.setAccessible(true);
//		System.out.println("Field Name = "+f1.getName());
//		System.out.println("Field type = "+f1.getType());
		Object obj =c.newInstance();
//		f1.set(obj, 30);
//		
//		Object ide = f1.get(c);
//		System.out.println("id ="+ide);
		
		Constructor con =c.getDeclaredConstructor(null);
				
		Field[] field = c.getDeclaredFields();
		
		for (Field field2 : field)
		{
			field2.setAccessible(true);
			System.out.println("object name :"+field2.getName()+ " : "+field2.get(obj));
			//System.out.println(field2.set(obj, value););
		}
		
		System.out.println("Enter method name :");
		String mname = sc.next();
//		Method m = c.getDeclaredMethod(mname);
//		m.invoke(obj);
		
		//int[] x = {45,89};
		
        //Class [] parameterType =new Class [] {x,y};

		Method m1 = c.getDeclaredMethod(mname,int.class,int.class);
		
		m1.invoke(obj,45,89);
		
//		Method m1 = c.getDeclaredMethod(mname);
//		m1.invoke(obj);
	}

}















//
//Class getDeclaredMethod() method in Java with Examples
//The getDeclaredMethod() method of java.lang.Class class is used to get the specified method of this class with the specified parameter type. The method returns the specified method of this class in the form of Method object.
//------------------------------------------------------------------------
//Syntax:--

//public Method getDeclaredMethod(String methodName, 
//                          Class[] parameterType)
//--------------------------------------------------------------------------
//     throws NoSuchMethodException, SecurityException



//Parameter: This method accepts two parameters:
//methodName which is the Method to be get.
//parameterType which is the array of parameter type for the specified method.
//Return Value: This method returns the specified method of this class in the form of Method objects.


//Exception This method throws:---------------------------------------
//NoSuchMethodException if a method with the specified name is not found.
//NullPointerException if name is null
//SecurityException if a security manager is present and the security conditions are not met.
//Below programs demonstrate the getDeclaredMethod() method.

