package study.HW;

import java.lang.reflect.Field;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the class name");
		Class obj =Class.forName(sc.next());
		Object obj1 =obj.newInstance();
		Field[] field = obj.getDeclaredFields();
		//Field[] field = obj.getFields();
		for (Field field2 : field)
		{
			field2.setAccessible(true);
			System.out.println("object name :"+field2.getName()+ " : "+field2.get(obj1));
			//System.out.println(field2.set(obj, value););
		}
		
		Field field2 = obj.getDeclaredField("id");
		//Field field2="id";
		field2.setAccessible(true);
		System.out.println("Field name :"+field2.getName());
		System.out.println("field Type :"+field2.getType());
	
		
		//Test test=(Test) obj.newInstance();
	//	Object test=obj.newInstance(); //obj1  Object obj1 =obj.newInstance();
		field2.set(obj1, 25);
		Object idValue =field2.get(obj1);
		//System.out.println("id :"+idValue);
		//Object test=obj.newInstance();
		Field[] field3 = obj.getDeclaredFields();
		//Field[] field = obj.getFields();
		for (Field result : field3)
		{
			result.setAccessible(true);
			System.out.println("object name :"+result.getName()+ " : "+result.get(obj1));
			//System.out.println(field2.set(obj, value););
		}
		
	}

}

//public void callgetN(int id,int price)
//{
//	Connection con = myGetConnection();
//	try {
//		//create procedure getN(in u_id int ,in u_price int,out u_name varchar(20))
//		CallableStatement cstmt = con.prepareCall("{call getN(?,?,?)}");
//
//		cstmt.registerOutParameter(3,Types.VARCHAR);
//		cstmt.setInt(1, id);
//		cstmt.setInt(2, price);
//		cstmt.execute();
//
//		String msg = cstmt.getString(3);
//		System.out.println("you got :"+msg);
//
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//}


/*
 --------------------------------------------------------------------------------------------------------------
obj.newInstance()-->
					Creates a new instance of the class represented by this Class object. 
					The class is instantiated as if by a new expression with an empty argument list. 
					The class is initialized if it has not already been initialized.
----------------------------------------------------------------------------------------------------------------
Class.forName(sc.next())-->
               				Parameters:className - the fully qualified name of the desired class.
			   				Returns:the Class object for the class with the specified name.
----------------------------------------------------------------------------------------------------------------
getDeclaredFields()-->
					1. Returns an array of Field objects reflecting all the fields declared by the class or interface represented by this Class object. 
			   			This includes public, protected, default(package) access, and private fields, but excludes inherited fields. 
			
					2. If this Class object represents a class or interface with no declared fields, then this method returns an array of length 0. 

					3. If this Class object represents an array type, a primitive type, or void, then this method returns an array of length 0. 

					4. The elements in the returned array are not sorted and are not in any particular order.
					
getFields()-->
     throws SecurityException             
			 .Returns an array containing Field objects reflecting all the accessible public fields of the class or 
			  interface represented by this Class object. 					

----------------------------------------------------------------------------------------------------------------
get(Object obj)-->
				Returns the value of the field represented by this Field, on the specified object. 
				The value is automatically wrapped in an object if it has a primitive type.
----------------------------------------------------------------------------------------------------------------
	




*/
