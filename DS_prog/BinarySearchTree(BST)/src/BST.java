
public class BST
{
	 Node root;
	 public BST()
	 {
		 root = null;
	 }
	
	public void Insert(int data)
	{
		Node it = root;
		Node temp = new Node(data);
		if(root==null)
		{
			root = temp;
		}
		
		else
		{
			while(true)
			{
			if(data < it.data)
			{
				if(it.left == null)
				{
					it.left = temp;
					break;
				}
				else
				{
					it=it.left;
				}
			}
			else if(data > it.data)
			{
				if(it.right == null)
				{
					it.right = temp;
					break;
				}
				else
				{
				   it=it.right;
				}
			}
			else
				break;
		 }
		}
	}
	
	
	
	
	
	
	public void preOrder()
	{
		System.out.print("PreOrder: ");
		printPreOrder(root);
		System.out.println();
	}

	private void printPreOrder(Node it) 
	{
		if(it != null)
		{
			System.out.print(it.data + ", ");
			printPreOrder(it.left);
			printPreOrder(it.right);
		}
	}

	//LPR
	public void inOrder()
	{
		System.out.print("InOrder: ");
		printInOrder(root);
		System.out.println();
	}

	private void printInOrder(Node it) {

		if(it != null)
		{
			printInOrder(it.left);
			System.out.print(it.data + ", ");
			printInOrder(it.right);
		}
	}

	//LRP
	public void postOrder()
	{
		System.out.print("PostOrder: ");
		printPostOrder(root);
		System.out.println();
	}

	private void printPostOrder(Node it) 
	{
		if(it != null)
		{
			printPostOrder(it.left);
			printPostOrder(it.right);
			System.out.print(it.data + ", ");
		}
	}
	
	
	
	public int printMinValue()
	{
		Node temp =root;
		if(temp==null)
		{
			System.out.println("tree is empty");
		}
		
		else
		{
			while(temp.left!=null)
			{
				temp = temp.left;
				System.out.println("Min value of tree is:" +temp.data);
			}
		}
		return temp.data;
	}
	public void printMaxValue()
	{
		Node temp =root;
		if(temp==null)
		{
			System.out.println("tree is empty");
		}
		
		else
		{
			while(temp.right!=null)
			{
				temp = temp.right;
				System.out.println("Min value of tree is:" +temp.data);
			}
		}
		
	}

	public void Deletekey(int key)
	{
		root = deleteSearch(root,key);
    }

	private Node deleteSearch(Node newroot, int key)
	{
		//condition 1. --check there is no root node
		if(newroot==null)
		{
			return null;
		}
		//condition 2.---only one node
		if(newroot.left==null && newroot.right==null)
		{
			newroot=null;
			return null;
		}
		if(key<newroot.data)
		{
			newroot.left=deleteSearch(newroot.left,key);//checking key in left side of newroot
		}
		if(key>newroot.data)
		{
			newroot.right=deleteSearch(newroot.right,key);
		}
		else
		{
			//search key mil gaya then goahead
			if(newroot.left==null)//newroot has only right child
			{
				return newroot.right;
			}
			
			if(newroot.right==null)//newroot has only left child
			{
				return newroot.left;
			}
			else
			{
				int x = getSmallestNumber(newroot.right);
				newroot.data = x;
				newroot.right = deleteSearch(newroot.right, x);
			}
		 }
		 return newroot;
		}
	
	
	private int getSmallestNumber(Node it)
	{
    	 while(it.left != null)
		it = it.left;
    	 return it.data;
     }
	
	public int height( Node newroot)
	{
		int height1=0,height2=0;
		if(newroot==null)
		{
			return 0;
		}
		
		if(newroot.left != null)
			height1 =height(newroot.left);
			
		
		if(newroot.right != null)
			height2=height(newroot.right);
		if(height1<height2)
		{
			//System.out.println(height2+1);
			return height2+1;//every recursion function call itself height plus one
		}   
		else
         return height1+1;  //every recursion function call itself height plus one
	}
	
}
