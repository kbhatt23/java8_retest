package methodReference;

import java.util.function.Function;

public class ReferenceExample2 {
	static Integer sizeInt(String str) {
		return str.length();
	}
	
	 Integer sizeIntinstance(String str) {
		return str.length();
	}
	
	public static void main(String[] args) {
Function<String, Integer> f1 = ReferenceExample2::sizeInt;
		System.out.println(f1.apply("messi is best"));
		
		
		ReferenceExample2 ka = new ReferenceExample2();
		Function<String, Integer> f2 = ka::sizeIntinstance;
		System.out.println(f2.apply("messi is best "));
		
	}

}
