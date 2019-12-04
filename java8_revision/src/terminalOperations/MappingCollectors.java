package terminalOperations;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Player;
import bean.PlayerDB;

public class MappingCollectors {

	public static void main(String[] args) {
		//use case
		List<String> uniqueHobbies = PlayerDB.fetchPlayers().stream()
			.map(Player::getHobbies)
			.flatMap(List::stream)
			.distinct()
			.collect(Collectors.toList());
		
		System.out.println(uniqueHobbies);
		
		//using collector mapping
		
		Set<String> uniHobbiesSet =PlayerDB.fetchPlayers().stream()
			.collect(Collectors.mapping(Player::getName, Collectors.toSet()));
			
			;
			System.out.println(uniHobbiesSet);
	}

}
