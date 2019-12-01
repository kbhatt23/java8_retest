package functionInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import bean.Player;
import bean.PlayerDB;

public class FunctionRealUsage {

	public static void main(String[] args) {
		Map<String, Integer> returnMap = new HashMap<String, Integer>();
		Function<List<Player>, Map<String, Integer>> fu = players -> {
			players.forEach(player -> {
				if(player.getAge() > 32) {
					returnMap.put(player.getName(), player.getAge());
				}
			});
			return returnMap;
		};
		
		System.out.println(fu.apply(PlayerDB.fetchPlayers()));
	}

}
