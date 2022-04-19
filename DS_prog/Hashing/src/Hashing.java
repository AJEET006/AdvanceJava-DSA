
public class Hashing {
	String [] array;
	
	public Hashing(int Size)
	{
		this.array=new String [Size];
	}
	
	public int HashFunction(String str)
	{
		int sum =0;
		for (int i = 0; i < this.array.length-1; i++)
		{
		     sum = sum + str.charAt(i);
		} 
		 int key = sum % array.length; //key is array index where to place that string in array
		return key;
	}
	
	public void Insert(String str)
	{
		int key = HashFunction(str);
		System.out.print(str+ " = is a String ");
		
		if(array[key] == null)
		{
			array[key] = str;
		}
		else
		{
			//collision...
			while(true)
			{
				if(key < array.length-1)
					key++;
				else
					key=0;

				if(array[key] == null)
				{
					array[key] = str;
					break;
				}
//				else if(key>str.length())
//				{
//					System.out.println(" out of bound");
//				}
			}
		}System.out.println(" and it is placed at " + key);
		
	}

	
	public String toString()
	{
		String str = "{";
		for (int i = 0; i < array.length; i++) {
			str = str + array[i] + ", ";
		}
		str = str + "}";

		return str;
	}
	
	
	
	

}
