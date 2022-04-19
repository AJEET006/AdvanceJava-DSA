
public class Node {
	
	    int data;
	    Node next;
	    
	    
	    Node()
	    {
	    	data =0;
	    	next = null;
	    }
	    
	    Node(int data)
	    {
	    	this.data=data;
	    }
	    
	    Node(Node next)
	    {
	    	this.next=next;
	    }
     Node(int data, Node next)
     {
    	 this.data=data;
    	 this.next=next;
     }
     
}
