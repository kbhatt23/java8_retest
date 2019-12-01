package functionInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerChaining {

	public static void main(String[] args) {
		BiConsumer<String, List<String>> bi = (str, hobbies) -> System.out.println(str+ " : "+ hobbies);
		
		BiConsumer<String, List<String>> bi1 = (str, hobbies) -> System.out.println(str+ " : "+ hobbies.size());
		
		bi
		.andThen(bi1)
		.accept("messi", Arrays.asList("god", "training"));
	}

}
