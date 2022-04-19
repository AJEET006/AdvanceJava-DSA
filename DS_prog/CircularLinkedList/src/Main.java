
public class Main {
	public static void main(String [] args)
	{
		CircularLL CLL = new CircularLL();
		
		CLL.Insert(63);
		CLL.Insert(60);
		System.out.println("CLL data are ------------" +CLL);
		
		CLL.deleteFirst();
		System.out.println("After DeleteFirst -------"+CLL);
		
		CLL.deleteLast();
		System.out.println("After DeleteLast -------"+CLL);
		CLL.Append(8120);
		CLL.Append(520);
		CLL.Append(930);
		System.out.println("After InsertLast --------"+CLL);
		
		CLL.InsertByPos(111,2);
	   System.out.println("After Insert by Pos--"+CLL);
	   CLL.DelByPos(1);
	   System.out.println("After DelByPos------"+CLL);
	    
	}
}
