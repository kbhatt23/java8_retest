package streamUsage;

import java.util.stream.Stream;

public class FactoryStreamFunctions {

	public static void main(String[] args) {
		Stream.iterate(1, i -> i+1)
			.limit(23)
			.forEach(System.out::println);
		;
		
		
	}

}
