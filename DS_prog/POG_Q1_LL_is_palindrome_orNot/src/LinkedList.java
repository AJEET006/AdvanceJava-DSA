
public class LinkedList {

	 Node head;
	public LinkedList()
	{
		this.head=null;
	}
	
	public LinkedList(Node head)
	{
		this.head=head;
	}
	
	
	//--------------------------------------------------------------------------------
	public static boolean isPalindrome(LinkedList list)
	{
		Node slowP, fastP, sec_start, prev_slowP;
		boolean result;
		if((list.head==null)||(list.head.next==null))
		{
			result = true;
		}
		else
		{
			prev_slowP = slowP=fastP = list.head;
			while(fastP.next!=null && fastP.next.next!=null)
			{
				prev_slowP=slowP;
				slowP=slowP.next;
				fastP=fastP.next.next;
			}
			System.out.println("Middle node = " + slowP.data);
			sec_start = slowP.next;
			if(fastP.next==null)//odd number of nodes is list
			{
				sec_start=reverse(sec_start);
				prev_slowP.next=null;
				result = isIdentical(list.head, sec_start);
				sec_start=reverse(sec_start);
				prev_slowP.next=sec_start;
			}
			else   //even number of nodes in list
			{
				sec_start=reverse(sec_start);
				slowP.next=null;
				result = isIdentical(list.head, sec_start);
				sec_start=reverse(sec_start);
				slowP.next=sec_start;
			}
			
		}return result;
	}
	
	
	public Node reverseprint(Node sec_start)
	{
		reverse(head );
		return sec_start;
	}

	private static  Node reverse(Node head)
	{
		// no need to reverse if head is null
		// or there is only 1 node.
		Node it=head;
		Node it_prev=null;
		Node it_next=head;

		while(it!=null) {
			it_next=it_next.next;
			it.next=it_prev;
			it_prev=it;
			it=it_next;
		}
		head=it_prev;
		return head;


	}




	public static boolean isIdentical(Node s1, Node s2)
	{
		while(true)
		{
			if(s1==null && s2==null)
				return true;
			if(s1==null || s2==null)
			{
				return false;
			}
			if(s1.data!=s2.data)
			{
				return false;
			}
			s1=s1.next;
			s2=s2.next;
		}
	}
	
	//--------------------------------------------------------------------
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
