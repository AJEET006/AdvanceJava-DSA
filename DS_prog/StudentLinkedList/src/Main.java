
public class Main {
	public static void main(String [] args) {
	
		
//		  
//		  Student s1= new Student("ajeet","M",27,450);
//		  Student s2= new Student("akash","M",30,550);
//		  Student s3= new Student("Sameer","M",25,650);
//		  Student s4= new Student("sonali","F",22,850);
//		  Student s5= new Student("Sugandha","F",30,250);
//		  Student s6= new Student("Kushal","M",27,150);
//		 
		 
		LinkedList list = new LinkedList();
		
		list.append(new Student("ajeet","M",27,450));
		list.append(new Student("Sameer","M",25,650));
		list.append(new Student("Kushal","M",27,150));
		list.append(new Student("sonali","F",22,850));
		list.append(new Student("Sugandha","F",30,250));
		list.insert(new Student("akash","M",30,550));
		
		System.out.println(list);
		
		list.deleteFirst();
		System.out.println(list);
		
		
		
	}

}
