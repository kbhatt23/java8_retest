package functionInterfaces;

import java.util.function.Function;

public class FunctionUsage {
public static void main(String[] args) {
	Function<String, Integer> f1 = str -> str.length();
	
	System.out.println(f1.apply("jai shree ram"));
}
}
