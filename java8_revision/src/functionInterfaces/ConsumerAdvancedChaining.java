package functionInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerAdvancedChaining {

	public static void main(String[] args) {
		List<String> players = Arrays.asList("Messi","Xavi","Iniesta","Puyol","Pique", "Busquets");
		
		//players.forEach(str -> System.out.println(str.length()));
		
		System.out.println();
		//chaining
		Consumer<String> combied = str -> System.out.println(str.toUpperCase());
		Consumer<String> combiedP=combied.andThen(str -> System.out.println(str.toLowerCase()))
				.andThen(str -> System.out.println(str.length()));
		
		players.forEach(combiedP);
				
	}

}
