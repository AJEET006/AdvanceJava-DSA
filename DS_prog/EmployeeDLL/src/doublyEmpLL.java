
public class doublyEmpLL
{
	private NodeEmp head;
	private NodeEmp tail;

	public doublyEmpLL() 
	{
		head = null;
		tail = null;
	}



	public void insert(Employee e)
	{
		NodeEmp new_node = new NodeEmp(e);

		if (head == null && tail == null)
		{
			head = tail = new_node;
		} 
		else 
		{
			new_node.set_next(head);
			head.set_prev(new_node);
			head = new_node;
		}
	}

	public void append(Employee e) {
		NodeEmp new_node = new NodeEmp(e);
		if (head == null && tail == null) {
			head = tail = new_node;
		} else {
			tail.set_next(new_node);
			new_node.set_prev(tail);
			tail = new_node;
		}
	}
          

	public void insert_at_pos(Employee e, int pos)
	{
		NodeEmp new_node = new NodeEmp(e);

		if (pos == 1)
		{
			insert(e);
			return;
		}

		NodeEmp it = head;

		for (int i = 1; i < pos - 1; i++)
		{
			if (it.get_next() == null)
			{
				break;
			}
			it = it.get_next();
		}

		if (it != tail)
		{
			new_node.set_next(it.get_next());
			new_node.set_prev(it);
			it.set_next(new_node);
			new_node.get_next().set_prev(new_node);
		} 
		else
		{
			append(e);
		}
	}

	public void Delete_by_pos(int Pos)
	{
		int length=CLLLength();
		if(Pos==1)
		{
			deleteFirst();
		}
		else if(Pos==length)
		{
			deleteLast();
		}
		else if(Pos >1 && Pos<length)
		{	
			Node it = head;
			Node it1=it.next;
			Node temp=it1.next;
			//traversing it to reach that location so that where to insert
			for(int i=1; i<Pos-1; i++)//
				{
					temp=temp.next;
			     	it1=it1.next;
			     	it=it.next;
				}
			     it.next=temp;
				 it1.next=null;
		}
		else
		{
			System.out.println("invalid position");
		}
	}
	

	public void deleteOlderThan31Age()
	{
		NodeEmp it=head;
		int i=1;
		while(it!=null)
		{
			if(it.get_data().get_age()>31)
			{
				Delete_by_pos(i);
			}
			i=i+1;
			it=it.get_next();
     
		}// end of while

}
