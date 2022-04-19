public class NodeEmp

{
	private Employee data;
	private NodeEmp prev,next;

	NodeEmp() 
	{
		data=prev=next=null;
	}
 
	NodeEmp(Employee e)
	{
			data=e;
	     prev=next=null;
	}

	void set_next(NodeEmp n)
	{
		next=n;
	}

	void set_prev(NodeEmp n)
	{
		prev=n;
	}

	void set_emp_data(Employee e)
	{
		data=e;
	}


  NodeEmp get_next()
  	{
	  return next;
  	}

  NodeEmp get_prev()
 	{
	  return prev;
  	}

  Employee get_emp_data()
  	{
	  return data;
  	}

  	public String to_String()
  	{
  		return data +" "; //Employee  sysout(Empo.toString())
  	}
}