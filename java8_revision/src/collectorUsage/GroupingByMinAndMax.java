package collectorUsage;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import bean.CategoryLevel;
import bean.Player;
import bean.PlayerDB;

public class GroupingByMinAndMax {

	public static void main(String[] args) {

		Map<CategoryLevel, Optional<Player>> minGoals = PlayerDB.fetchPlayers().stream()
													.collect(Collectors.groupingBy(Player::getCategoryLevel,
															Collectors.maxBy(Comparator.comparing(Player::getGoals))
															));
		
		minGoals.entrySet().forEach(ent -> {
			
			System.out.println(ent.getKey() + " "+ ent.getValue().get().getName());
		});
		
		Map<CategoryLevel,String> nameMap =  PlayerDB.fetchPlayers().stream()
			.collect(Collectors.groupingBy(Player::getCategoryLevel,
					Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Player::getGoals)),
							player -> player.get().getName())
					
					));
		
		nameMap.entrySet().forEach(ent -> {
			
			System.out.println(ent.getKey() + " "+ ent.getValue());
		});

	}

}
