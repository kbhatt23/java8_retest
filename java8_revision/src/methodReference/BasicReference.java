package methodReference;

import java.util.function.Function;

public class BasicReference {

	public static void main(String[] args) {
		//first way to create
		//non static style if class is same
		Function<String, String> upperFunctionReference  = String::toUpperCase;
		
		
		Function<String, String> upperFunction  = str -> str.toUpperCase();
		
		System.out.println(upperFunctionReference.apply("messi is best"));
		
		//another example
		
		Function<String, Integer> sizereference = String::length;
		System.out.println(sizereference.apply("messi is best"));
		}

}
