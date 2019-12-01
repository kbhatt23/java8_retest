package functionInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<String> p = str -> str.length() >= 7 ;
		System.out.println(p.test("messi is best"));
		
		System.out.println(p.and((str) -> str.length() > 10)
			//.and(str -> str.length() > 14)
			.test("messi is best"))
		;
	}

}
