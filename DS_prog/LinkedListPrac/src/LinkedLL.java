
public class LinkedLL {
	Node head;
	
	LinkedLL()
	{
	     head = null;
	}
	
	LinkedLL(Node head)
	{
		this.head=head;
	}
	
	
	public void InsertFirst(int data)
	{
		Node temp = new Node(data);
		      if(head==null)
		      	head=temp;
	    	else 
	        	{
	         		temp.next=head;
			        temp.next=null;
		       }
	}
	
	public String toString()
	{
		String str ="";
		if(head==null)
			System.out.println("Linked list is empty");
		else 
		{
			Node it = head;
			while(it !=null)
			{
			   str =it.data+"";
			   it=it.next;
			}
			
		}
		return str;
	}
	

}
