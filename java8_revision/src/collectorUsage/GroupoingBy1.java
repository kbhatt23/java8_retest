package collectorUsage;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import bean.Player;

import bean.PlayerDB;

public class GroupoingBy1 {

	public static void main(String[] args) {
		Map<String, List<Player>> playerMap = PlayerDB.fetchPlayers().stream()
			.collect(Collectors.groupingBy(player -> {
				return ((Player)player).getGoals() >=50 ? "Goal-Scorer": "Play-Maker" ;
			}));
		
		Map<Boolean, List<Player>> playerMappartition=	PlayerDB.fetchPlayers().stream()
		.collect(Collectors.partitioningBy(player-> ((Player)player).getGoals() >=50 ));
		
		playerMap.entrySet().forEach(System.out::println);
		
		System.out.println();
		playerMappartition.entrySet().forEach(System.out::println);
	}

}
