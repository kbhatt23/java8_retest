package functionInterfaces;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {
		Function<String, String> f1 =str -> str.replace(" ", "");
		Function<String, Integer> f2  =f1.andThen(str -> str.length());
		System.out.println(f2.apply("messi is best"));
		
		//compose chaining
		System.out.println(f2.compose(f1).apply("messi is best"));
		
		Function<Integer, String> f3 = count -> {
			StringBuilder sb = new StringBuilder();
			for(int i=0 ; i <=count ; i++) {
				sb.append("a ");
			}
			return sb.toString();
		};
		
		System.out.println(f1.compose(f3).apply(10));
	}

}
