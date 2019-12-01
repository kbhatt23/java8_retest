package functionInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import bean.Player;
import bean.PlayerDB;

public class BiFunctionUsage {

	public static void main(String[] args) {
		Map<String, Integer> returnMap = new HashMap<String, Integer>();
		BiFunction<List<Player>, Predicate<Player>, Map<String, Integer>> bif = (players,pre) ->{
			players.forEach(player -> {
				if(pre.test(player)) {
					returnMap.put(player.getName(), player.getAge());
				}
			});
			return returnMap;
		};
		Predicate<Player> p = player -> player.getAge() >32 && player.getHobbies().size()>5;
		System.out.println(bif
				.apply(PlayerDB.fetchPlayers(), p));
	}

}
