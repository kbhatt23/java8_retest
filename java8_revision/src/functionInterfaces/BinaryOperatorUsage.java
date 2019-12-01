package functionInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorUsage {

	public static void main(String[] args) {

		BinaryOperator<String> b = (str1,str2) -> str1 + str2;
		System.out.println(b.apply("messi", "lionel"));
		//min and max
		Comparator<Integer> c = (a1,a2) -> a2.compareTo(a1); 
		System.out.println(BinaryOperator.minBy(c).apply(23,32));
	}

}
