package numericStream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AggregrateFunctions {

	public static void main(String[] args) {
	System.out.println(	IntStream.range(1, 5)
		.skip(4)
		.count());
	
	Integer min = IntStream.range(1, 5)
	.skip(2)
	.min().orElseThrow(() -> new RuntimeException("jai shree ram"));
	
	System.out.println(min);
	
	}

}
