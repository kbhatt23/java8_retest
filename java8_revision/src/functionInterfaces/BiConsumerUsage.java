package functionInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerUsage {
	public static void main(String[] args) {
		BiConsumer<String, String> b1 = (s1,s2) -> System.out.println(s1+s2);
		b1.accept("messi", "xavi");
		
		//cochainign
		BiConsumer<Integer, Integer> add = (a,b) -> System.out.println(a+b);
		
		add.andThen((a,b) -> System.out.println(a-b))
			.andThen((a,b) -> System.out.println(a*b))
			.accept(23, 5);
		;
		
		
	}

}
