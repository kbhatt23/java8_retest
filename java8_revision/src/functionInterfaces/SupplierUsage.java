package functionInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import bean.CategoryLevel;
import bean.Player;
import bean.PlayerDB;

public class SupplierUsage {

	public static void main(String[] args) {
		Supplier<Player> s1 =  Player::new;
		System.out.println(s1.get());
		
		Supplier<Player> s2 =  () -> new Player("messi", 10,
				Arrays.asList("god","running", "gym","family" ),
				32, CategoryLevel.A);
		System.out.println(s2.get());
		
		Supplier<List<Player>> sp2 = () -> PlayerDB.fetchPlayers();
		sp2.get().forEach(System.out::println);
	}

}
