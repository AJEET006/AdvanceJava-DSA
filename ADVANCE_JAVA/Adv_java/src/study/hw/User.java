package study.hw;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class User
{
	Scanner sc = new Scanner(System.in);
	private String name;
	private int day,month,year;
	
	class Agecal
	{
		void showAge() //GregorianCalendar​(int year, int month, int dayOfMonth)
		{
			System.out.println("enter day :");
			int day=sc.nextInt();
			System.out.println("enter month :");
			int month=sc.nextInt();
			System.out.println("enter year :");
			int year = sc.nextInt();
			Calendar c = new GregorianCalendar(year,month,month);
			Calendar c1 = new GregorianCalendar();
			int age=0;
			
			age=c1.get(Calendar.YEAR)-c.get(Calendar.YEAR);
			System.out.println(age);
			//System.out.println("name of user :"+name+ "\n day :"+Calendar.ALL_STYLES+ "\n month :"+Calendar.MONTH+ "\n year :"+GregorianCalendar.YEAR);
			
		}
	}
	
	public static void main(String[] args)
	{
		Agecal a = new User().new Agecal();
		
		a.showAge();
	}
	
}
