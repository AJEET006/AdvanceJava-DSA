package lamda;

import java.util.ArrayList;

public class Stream {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("ajeet");
		a.add("sandeep");
		a.add("singh sahab");
		a.add("tripathi");
		a.add("waykar");
		a.add("zyle");
		a.add("onkar");
		a.add("sugandha");

		a.forEach((b)->
		{
			for (int i = 0; i <2; i++)
			{
				System.out.println("object given to accept()");
			}
		});

		a.stream().forEach((b)->{System.out.println(b.toUpperCase());});


	}

}


//Interface Consumer<T>
//
//
//Type Parameters:T - the type of the input to the operationAll Known Subinterfaces:Stream.Builder<T>Functional Interface:This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.
//
//@FunctionalInterface
//public interface Consumer<T>..............
//Represents an operation that accepts a single input argument and returns noresult.
//Unlike most other functional interfaces, Consumer is expectedto operate via side-effects. 
//This is a functional interfacewhose functional method is accept(Object).
//Since:1.8
