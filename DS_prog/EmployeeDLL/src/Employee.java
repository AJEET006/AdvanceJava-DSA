
public class Employee{
  private int age;
  private float sal;
  private String name;
  
  		public Employee()
  		{
  			age=0;
  			sal=0.0f;
  			name=null;
  		}

  	public Employee(String nm,int a,float s)
  		{
  			age=a;
  			sal=s;
  			name=nm;
  		}


  		void set_age(int a)
  		{
  			age=a;
  		} 
 
  		void set_sal(float s)
  		{
  			sal=s;
  		}
 
  		void set_name(String a)
  		{
  			name=a;
  		}  

  		int get_age()
  		{
  			return age;
  		}

  		float get_sal()
  		{
  			return sal;
  		}

  		String get_name()
  		{
  			return name;
  		}


  		public String to_String()
  		{
  			String str;
  			str=name+"  " +age+"  "+sal;
  			return str;
  		}
}

  