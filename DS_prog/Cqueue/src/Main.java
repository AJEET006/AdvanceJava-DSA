
public class Main {
	public static void main(String [] args)
	{
		CQueue C = new CQueue(5);
		
		C.Insert(20);
		C.Insert(45);
		C.Insert(12);
		C.Insert(36);
		C.Insert(89);
     	C.Insert(1);
		System.out.println(C);
		C.Remove();
		C.Remove();
		C.Remove();
		System.out.println(C);
	}

}
