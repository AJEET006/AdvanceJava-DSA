
public class CircularLL {
	Node head;
	
	
	public CircularLL()
	{
		this.head=null;
	}
	public CircularLL(Node head)
	{
		this.head=head;
	}
	
	public void Insert(int data)
	{
		Node temp = new Node(data);
		
		if(head==null)
		{
			head=temp;
			head.next=head;
		}
		
//		else if(head.next==head)
//		{  
//			temp.next=head.next;
//			head=temp;
//		}
		else
		{
			Node it=head;
			while(it.next!=head)
			{
				it=it.next;
			}
			it.next=temp;
			temp.next=head;
			head=temp;
		 }
		
		}
	public void deleteFirst()
	{
		if(head==null)
		{
			System.out.println("Cll is empty");
		}
		else
		{
			//to check next node.........only one node in linkedList
			if(head.next==head)
			{
				//head.next=null;
				head=null;
			}
			else
			{
				Node t=head;
				Node temp=new Node();
				temp=head;
				while(t.next!=head)
				{
					t=t.next;
				}	
					t.next=temp.next;
					head=temp.next;
					temp.next=null;
					
			}
		}
		
	}	
	
	public void Append(int data)
	{
		Node temp = new Node(data);
		if(head==null)
		{
			head=temp;
			temp.next=head;
		}
//		else if(head.next==head)
//		{
//			head.next=temp;
//			temp.next=head;
			
			Node t =head;
			while(t.next!=head)
			{
				t=t.next;
			}
			t.next=temp;
			temp.next=head;
		}
	public void deleteLast()
	{
		if(head==null)
		{
			System.out.println("Cll is empty");
		}
		else
		{
			//to check next node.........only one node in CircularlinkedList
			if(head.next==head)
			{
				//head.next=null;
				head=null;
			}
			else
			{
				Node t=head;
				Node temp=t.next;
				while(temp.next!=head)
				{
					t=t.next;
					temp=temp.next;
				}	
					
				t.next=head;
				temp.next=head;
				temp=null;
			}
		}
		
	}	
	
	private int CLLLength()
	{
		if(head==null)
			return 0;
		else
		{
		  int length=1;
		  Node t=head;
		  while(t.next!=head)
		  {
			length++;
		  }
		return length;//returning total length of CLL
		}
		
	}
	
	public void InsertByPos(int data, int Pos) //12 
	{
		int length=CLLLength(); //4
		
		if(Pos==1)
		{
			Insert(data);
		}
		else if(Pos==length+1)
		{
			Append(data);
		}
		else if(Pos >1 && Pos<length+1)//true
		{	
			Node temp = new Node(data);
			Node it = head;
			//traversing it to reach that location so that where to insert
			for (int i= 1; i<Pos-1; i++) //1<2
			{
			     	it=it.next;
			}
			 temp.next=it.next;
			 it.next=temp;
		}
		else
		{
			System.out.println("invalid position");
		}
	}
	
	
	
	public void DelByPos(int Pos)
	{
		int length=CLLLength(); //5
		if(Pos==1)
		{
			deleteFirst();
		}
		else if(Pos==length) //
		{
			deleteLast();
		}
		else if(Pos >1 && Pos<length) //1 && 1//3<5
		{	
			Node it=head;
			for(int i =0 ; i<Pos-1;i++)
			{
				it = it.next;
			}
			Node temp=it.next;
			it.next=temp.next;
			temp=null;
//			Node it = head.next;
//			Node it1=it.next;
//			Node temp=it1.next;
			//traversing it to reach that location so that where to insert
//			for(int i=1; i<=Pos+1; i++)
//				{
//					temp=temp.next;
//			     	it1=it1.next;
//			     	it=it.next;
//				}
//			    it.next=it1.next;
//				 it1=null;
		}
		else
		{
			System.out.println("invalid position");
		}
	}
	
	public String toString ()
	{
		String str = " ";
		if(head==null)
		
			System.out.println("CircularLL is empty");
		
		else
		{
			 
			str=str+head.data+ ",";
			 Node it = head.next;
			  while(it!=head)
			  {
			   str=str+it.data+ ",";
			     it=it.next;
			  }
			  }
		return str;
	}

}
