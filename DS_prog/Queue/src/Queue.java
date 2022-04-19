
public class Queue {
       
	 private int [] arr;
	 private int F =-1;
	 private int R =-1;
	 
	 
	 
	 public Queue()
	 {
		 this.arr = new int [6];
		 this.F=-1;
		 this.R=-1;
	 }
	 public Queue(int size)
	 {  
		 this.arr = new int [size];
		 this.F=-1;
		 this.R=-1;
	 }
	 
	 public void insert (int value)
	 {
		 if(R<arr.length-1)
		 {
			 R++;
			 arr[R]=value;
			 if(F==-1)
			 {
				F++;
			 }
			
		 }
		 else
		 System.out.println("Queue is full");
	 }
	 
	 public int remove()
	 {
		 int value=0;
		 if(F!=-1)
		 {
			 value = arr[F];
			 if(F!=R)
			 {
				 F++;
			 }
			 else
				 F=R=-1;
		 }
		 else
			 System.out.println("Queue is empty");
		 return value;
	 }
	 public String toString()
	 {
		 String str = "";
		 if(F==-1)
			 str="Queue is empty";
		 else
		 {
			 for(int i=F;i<=R;i++)
			 {
				 str =str +arr[i]+ ",";
			 }
		 }
	 return str;
	 }

}
