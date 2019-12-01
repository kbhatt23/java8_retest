package functionInterfaces;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorUsage {

	public static void main(String[] args) {
		Function<String, String> f = str -> str.toUpperCase();
		
		System.out.println(f.apply("messi"));
		
		//use of unaryoperator
		UnaryOperator<String> f1 = str -> str.toUpperCase();
		System.out.println(f1.apply("messi1"));
		
		System.out.println(f1.andThen(str -> str.length()).apply("messi12"));
		
		
		
	}

}
