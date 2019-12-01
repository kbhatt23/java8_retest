package methodReference;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import bean.Player;

public class FunctionConstructorReference {

	public static void main(String[] args) {
		Supplier<Player> fas = Player::new;
		Function<String, Player> fa1 = Player::new;
		System.out.println(fa1.apply("messi"));
		
		BiFunction<String, Integer, Player> bif = Player::new;
		System.out.println(bif.apply("kaka", 22));
	}

}
