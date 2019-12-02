package streamUsage;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Player;
import bean.PlayerDB;

public class DistinctUsage {

	public static void main(String[] args) {
		List<Player> players = PlayerDB.fetchPlayers().stream()
			.distinct()
			.collect(Collectors.toList());
		
		System.out.println(players.size());
		
		Set<Player> playersSet = PlayerDB.fetchPlayers().stream()
				.collect(Collectors.toSet());
		System.out.println(playersSet.size());
	}

}
