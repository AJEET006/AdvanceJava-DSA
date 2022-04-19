
public class Main {
	public static void main(String [] args)
	{
		BST b = new BST();
		
		b.Insert(85);
		b.Insert(23);
		b.Insert(90);
		b.Insert(11);
		b.Insert(2);
		b.Insert(25);
		b.Insert(35);
		b.Insert(24);
		b.Insert(90);
		  
		b.Insert(105);
		b.Insert(106);
		
	    b.inOrder();
		b.postOrder();
		b.preOrder();
		b.printMinValue();
		b.Deletekey(90);
		b.inOrder();
		System.out.println("height of tree is:" +b.height(b.root));
		
	}
	
	

	
}
