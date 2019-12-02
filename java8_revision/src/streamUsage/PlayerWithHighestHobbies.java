package streamUsage;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import bean.Player;
import bean.PlayerDB;

public class PlayerWithHighestHobbies {

	public static void main(String[] args) {

		//using max and comparator
		Player minPlaye = PlayerDB.fetchPlayers().stream()
				.max((p1,p2) -> {
					return Integer.valueOf(p1.getHobbies().size())
							.compareTo(p2.getHobbies().size());
				}).orElseThrow(() -> new RuntimeException("khali hai") );
		
		//System.out.println(minPlaye);
		
		//in case thee are more than one entry for max size
		
		Integer minimumHobyCount = PlayerDB.fetchPlayers().stream()
								.mapToInt(player -> player.getHobbies().size())
								.max().orElseThrow(RuntimeException :: new);
		List<Player> minPlayers = PlayerDB.fetchPlayers().stream()
										.filter(p -> p.getHobbies().size() == minimumHobyCount)
										.collect(Collectors.toList());
		minPlayers.forEach(System.out::println);
		
		//using reduce
		Optional<Player> maxPlayer = PlayerDB.fetchPlayers().stream().reduce((p1,p2) -> {
			return p1.getHobbies().size() > p2.getHobbies().size() ? p1: p2; 
		});
		System.out.println(maxPlayer);
	}

}
