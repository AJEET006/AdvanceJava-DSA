
public class Employee {
	
	String Name;
	String EmpId;
	int Salary;
	
	public Employee()
	{
		this.Name="Ashok";
		this.EmpId="ADER45O";
		this.Salary=67000;
	}
	public Employee(String name, String Id, int salary )
	{
		this.Name=name;
		this.EmpId=Id;
		this.Salary=salary;
	}
	public String toString()
	{
		String str="Name =" +this.Name+  "  EmpId =" +this.EmpId+ "  Salary =" +this.Salary+ "\n";
		return str;
	}

}
