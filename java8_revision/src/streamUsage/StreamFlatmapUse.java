package streamUsage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import bean.Player;
import bean.PlayerDB;

public class StreamFlatmapUse {

	public static void main(String[] args) {

		PlayerDB.fetchPlayers().stream()
			.map(Player::getHobbies)//stream of list<string>
			.flatMap(List::stream)
			.distinct()
			.forEach(System.out::println);
		System.out.println("-------------");
		PlayerDB.fetchPlayers().stream()
			.map(Player::getArrayEntries)
			.flatMap(ent -> Arrays.stream(ent))
			.distinct()
			.forEach(System.out::println);
		
		
	}

}
