package functionInterfaces;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import bean.Player;
import bean.PlayerDB;

public class BiPredicateUsage {
public static void main(String[] args) {
	Predicate<Player> p = player -> player.getName().length() > 7;
	Predicate<Player> p1 =p.or(player -> player.getHobbies().size() > 4);
	PlayerDB.fetchPlayers()
		.forEach(player-> {
			if(p1.test(player)) {
				System.out.println(player.getName());
			}
		});
	
	System.out.println("naya cha;lu");
	//using bipredicate
	BiPredicate<String, List<String>> bi = (name,hobbies) -> name.length() > 4 && hobbies.size()>4;
	BiPredicate<String, List<String>> bi1 = bi.and( (name,hobbies ) -> name.length()==6 && hobbies.contains("song"));
	PlayerDB.fetchPlayers()
	.forEach(
			player -> {
				if(bi1.test(player.getName(), player.getHobbies())) {
					System.out.println(player.getName());
				}
			}
			);
}
}
