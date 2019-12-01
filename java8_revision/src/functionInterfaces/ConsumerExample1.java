package functionInterfaces;

import java.util.function.Consumer;

public class ConsumerExample1 {

	public static void main(String[] args) {

		Consumer<String> c = (str) -> System.out.println(str.length());
		c.andThen(System.out::println).andThen(str -> System.out.println(str.toUpperCase())).accept("messi is best");
	}

}
