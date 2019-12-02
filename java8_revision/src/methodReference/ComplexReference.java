package methodReference;

import java.util.Arrays;
import java.util.function.Function;

import bean.CategoryLevel;
import bean.Player;
import bean.PlayerDB;

public class ComplexReference {

	public static void main(String[] args) {

		Function<Player, String> f= Player::getName;
		
		Player p = new Player("messi", 10,
				Arrays.asList("god","running", "gym","family" ),
				32, CategoryLevel.A,32);
		System.out.println(f.apply(p));
	}

}
