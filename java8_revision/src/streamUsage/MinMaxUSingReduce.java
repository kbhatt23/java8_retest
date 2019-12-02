package streamUsage;

import java.util.stream.Stream;

public class MinMaxUSingReduce {

	public static void main(String[] args) {
		//max
		int max = Stream.of(4,2,4,5,1,62,43)
			.reduce((a,b) -> a>b ? a: b).orElseThrow(RuntimeException::new);
		System.out.println(max);
		
		int min = Stream.of(4,2,4,5,1,62,43)
				.reduce((a,b) -> a>b ? b: a).orElseThrow(RuntimeException::new);
		System.out.println(min);
	}

}
