package streamUsage;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import bean.PlayerDB;
import bean.CategoryLevel;
import bean.Player;

public class StreamUSage1 {

	public static void main(String[] args) {
		Map<String, Integer> map= PlayerDB.fetchPlayers().stream()
			.collect(Collectors.toMap(player -> {
				Player p = (Player)player;
				return p.getName();
			}, player -> {
				Player p = (Player)player;
				return p.getAge();
			}));
		
		System.out.println(map);
		
		System.out.println();
		
		Map<String, Integer> map1= PlayerDB.fetchPlayers().stream()
				.filter(Player::isPlayerGood)
				.collect(Collectors.toMap(Player::getName, Player::getAge));
		
		
		System.out.println(map1);
	}

}
