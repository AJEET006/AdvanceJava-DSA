
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
	public void insert(int data)
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
			//(pahale naye node yani temp ko purane linkedlist se link karake usake bad head ko temp ko ponit karega)
		}
		
	}
	
	
	
	public void append(int data)
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
	
	public void deleteLast()
	{
		
		if(head!=null)
			{
			if(head.next==null)
				{
				head=null;
				}
				else
				{
					Node tmp = new Node();
					tmp=head;
					while(tmp.next.next!=null)
					{
					
						tmp=tmp.next;   //iterating tmp till tmp.next.next not equal to null.....
					}	
					tmp.next=null;       //jaise hi upar wali condition false hui ,make temp.next null...
					
				}
			}
	}
	
	public void deleteByValue(int pos)
	{
		int count = getLLength();
		
		if(pos == 1)
		{
			deleteFirst();
		}
		else if(pos == count)
		{
			deleteLast();
		}
		else if(pos > 1 && pos < count)
		{
			//Middle element..
			Node it = head;
			for(int i=1; i<pos-1; i++)
			{
				it = it.next;
			}
			
			Node tmp = it.next;
			
			it.next = tmp.next;
			tmp.next = null;
			tmp=null;			
		}
		else
		{
			System.out.println("Invalid Position..");
		}
	}
	
	private int getLLength()
	{
		//Find length of LL
		int noOFNodes = 0;
		Node it = head;
		while(it.next != null)
		{
			noOFNodes++;
			it= it.next;
		}
		return noOFNodes;
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
			str+= it.data+ ",";
			it=it.next;
			}
			
		}
		return str;
	}
}
