
public class LinkedList {

	private Node head;
	public LinkedList()
	{
		this.head=null;
	}
	
	public LinkedList(Node head)
	{
		this.head=head;
	}
	public void insert(Student data)
	{
		Node temp = new Node(data);
		if(head==null)
		{
			head = temp;
		}
		else        
		{
			temp.next=head;//insert of new temp to linkedlist
			head=temp;//head pointing to temp
			//(pahale naye node yani temp ko purane linkedlist se link karake usake bad head ko temp ko point karega)
		}
		
	}
	
	
	
	public void append(Student data)
	{
		Node temp = new Node(data);
		
		
		if(head==null)
		{
			head = temp;
		}
		else
		{
			Node it = head;
			
			//while(it.next !=null)
			while(it.next !=null)	
			{
				it = it.next;
			}
			//it reached last node;
			it.next = temp;
			temp.next = null;
		}
		
	}
	
	public void deleteFirst()
	{
		if(head==null)
		{
			System.out.println("Ll is empty");
		}
		else
		{
			//to check next node.........only one node in linkedList
			if(head.next==null)
			{
				head = null;
			}
			else
			{
				Node t=head;
				head = head.next;
				t.next = null;
			}
		}
		
	}
	
	
	
	public String toString() 
	{
		String str = "";
		if(head== null)
		{
			str = "LL is empty";
		}
		else
		{
			Node it = head;
			
			//while(it.next !=null) //this is without last node
	      while(it !=null) //with last node
			{
			str+= it+ ",";
			it=it.next;
			}
			
		}
		return str;
	}
}
