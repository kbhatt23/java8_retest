package collectorUsage;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import bean.CategoryLevel;
import bean.Player;
import bean.PlayerDB;

public class GroupingByYoungestPlayer {

	public static void main(String[] args) {
		Map<CategoryLevel, Optional<Player>> optionalMap =PlayerDB.fetchPlayers().stream()
			.collect(Collectors.groupingBy(Player::getCategoryLevel,
					Collectors.minBy(Comparator.comparing(Player::getAge))
					
					));
		
		/*
		 * optionalMap.forEach((key,value) -> { System.out.println(key + " "+
		 * value.get().getName());
		 * 
		 * });
		 */
		
		Map<CategoryLevel, Player> nameMap = PlayerDB.fetchPlayers().stream()
		.collect(Collectors.groupingBy(Player::getCategoryLevel,
				Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Player::getAge)),
						playerOptional -> playerOptional.get()
						)
				
				));
		
		nameMap.forEach((key,value) -> System.out.println(key + " "+ value));
		
	}

}
