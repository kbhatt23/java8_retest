package streamUsage;

import java.util.stream.Stream;

public class ReduceInteger {

	public static void main(String[] args) {

		Integer sum = Stream.of(1,2,4,5,6,3,2,2,5,6)
			.reduce(0, (a,b) -> a+b);
		System.out.println(sum);
		
		//multiplication using reduce
		Integer mul = Stream.of(1,2,4,5,6,3,2,2,5,6)
						.reduce(1, (a,b) -> a*b);
		System.out.println(mul);
	}

}
