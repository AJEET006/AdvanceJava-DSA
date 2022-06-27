package study.lamda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamEx {
    public static ArrayList<String> al = new ArrayList<>();
	public static void main(String[] args) {
		
		
		al.add("red");
		al.add("blue");
		al.add("white");
		al.add("pink");
		al.add("violet");
		
		
		al.stream().forEach((element)->{System.out.println("this is "+element);});
		
		
		al.stream().forEach((e)->{System.out.println(e.toUpperCase());});
		
		myForEach((e1)->{System.out.println("my for each "+al);});
		
		
		
		System.out.println("after filtering");
		Stream<String> st1 = al.stream();
		Stream<String> st2 = st1.filter((ele)->{if(ele.length()<5) return true;else return false;});
		st2.forEach((e)->{System.out.println(e);});
		
		System.out.println("Another filter filtering");
		al.stream().filter((ele)->{if(ele.length()<5) return true;else return false;});
		
	
	}//end of main
	
	static void myForEach(Consumer<String> consumer)
	{
		for (int i = 0; i < al.size(); i++)
		{
			String ele = al.get(i);
			consumer.accept(ele);
		}
	} 

}
