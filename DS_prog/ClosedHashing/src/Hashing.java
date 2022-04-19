

public class Hashing {

	LinkedList []array;

	Hashing(int size){
		array=new LinkedList[size];

		for(int i=0;i<array.length;i++) {
			array[i]=new LinkedList();
		}
	}

	public int hashingFunct(String str) {
		int index=0;

		for(int i=0;i<str.length();i++) {
			index=index+str.charAt(i);
		}

		int key=index%array.length;
		return key;
	}

	public void insertL(String str) {
		int index=hashingFunct(str);
		array[index].append(str);
		System.out.println(str + " is placed at "+index);
	}

	public void removeL(String str) {
		int index=searchStrL(str);
		if(array[index].deleteByValue(str)==0) {
			System.out.println("Invalid Input");
		}
		else {
			System.out.println("removed");
		}
	}

	public int searchStrL(String str) 
	{
		int index=hashingFunct(str);
		System.out.print(str + " key from hashFunction = " + index);
		return index;
	}

	public String toString() 
	{
		String str="";
		str=str +"{ ";
		for(int i=0;i<array.length;i++) {
			str=str+array[i]+", ";
		}
		str=str +"}";
		return str;
	}
}
