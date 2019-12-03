package collectorUsage;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import bean.PlayerDB;
import bean.CategoryLevel;
import bean.Player;

public class PartitionByUSage {

	public static void main(String[] args) {
	Map<Boolean, List<String>>	nameMap = PlayerDB.fetchPlayers().stream()
				.collect(Collectors.partitioningBy(p -> ((Player)p).getCategoryLevel() == CategoryLevel.A,
				Collectors.mapping(Player::getName, Collectors.toList())
				));

	nameMap.forEach((k,v) -> System.out.println(k+" "+v));
	
	
	//youngest
	Map<Boolean,Player> youngMap =
	PlayerDB.fetchPlayers().stream()
	.collect(Collectors.partitioningBy(p -> ((Player)p).getCategoryLevel() == CategoryLevel.A,
	Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Player::getAge)),
		Optional::get
			))
	);
	youngMap.forEach((k,v) -> System.out.println(k+" "+v));
	
	//youngest name only
	Map<Boolean,String> youngNameMap =
	PlayerDB.fetchPlayers().stream()
	.collect(Collectors.partitioningBy(p -> ((Player)p).getCategoryLevel() == CategoryLevel.A,
	Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Player::getAge)),
		opt -> opt.get().getName()
			))
	);
	youngNameMap.forEach((k,v) -> System.out.println(k+" "+v));
	}

}
