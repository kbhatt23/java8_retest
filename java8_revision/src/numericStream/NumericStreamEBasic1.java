package numericStream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumericStreamEBasic1 {

	public static void main(String[] args) {

		Integer sum =Stream.iterate(1, i -> i+1).limit(100)
			.reduce((a,b) -> a+b).orElseThrow(RuntimeException::new);
		System.out.println(sum);
		
		//method2
		Integer sum1 =Stream.iterate(1, i -> i+1).limit(100)
					.mapToInt(i -> i)
					.sum();
		System.out.println(sum1);
		
		Integer sum2 =IntStream.iterate(1, i -> i+1)
		.limit(100)
		.sum();
		
		System.out.println(sum2);
		
Integer sum4= 	IntStream.rangeClosed(1, 100)
		.sum();

System.out.println(sum4);
	}

}
