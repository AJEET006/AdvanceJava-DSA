package study.lamda;

import java.util.Comparator;
import java.util.TreeSet;

public class LambdaEx2 {

	public static void main(String[] args) {
		
		Comparator<Student> s1 =(o1,o2)->{
			
			if((o1.roll)>o2.roll) return 1;
			if((o1.roll)<o2.roll) return -1;
			else
			return 0;
			
		};
		TreeSet<Student> S=new TreeSet<>(s1); 
		S.add(new Student(40,"ajeet"));
		S.add(new Student(1,"sandeep"));
		S.add(new Student(17,"Aj"));
		S.add(new Student(25,"mahi"));
		S.add(new Student(12,"adbhud"));
		
		for (Student s : S) {
			System.out.println(s);
		}

	}

}

class Student implements Comparable<Student>
{
	int roll;
	String name;
	
	Student(int r,String name)
	{
		roll=r;
		this.name=name;
	}
	
	
	public String toString()
	{
		String str="roll="+this.roll+ " name="+this.name;
		return str;
	}
	
	
	
	@Override
	public int compareTo(Student o) {
		
		return this.name.compareTo(o.name);
	}
}