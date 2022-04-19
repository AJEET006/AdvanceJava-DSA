
public class Student {
	
	
	private String name;
	private String gender;
	private int rollNo;
	private int marks;
	
	public Student()
	{
		this.name="xyz";
		this.gender="M";
		this.rollNo=0;
		this.marks=0;
	}
	
	public Student(String name, String gender, int rollNo, int marks)
	{
		this.name=name;
		this.gender=gender;
		this.rollNo=rollNo;
		this.marks=marks;
	}
	
	
	public String toString()
	{
		String str = this.name+">> " +this.gender+"," +this.rollNo+"," +this.marks+"\n";
		return str;
	}
	
	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}