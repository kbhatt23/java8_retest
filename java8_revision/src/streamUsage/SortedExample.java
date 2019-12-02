package streamUsage;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import bean.Player;
import bean.PlayerDB;

public class SortedExample {

	public static void main(String[] args) {
		//below will give only names
	List<String>	sortedNames =PlayerDB.fetchPlayers().stream()
			.map(Player::getName)
			.sorted()
			.collect(Collectors.toList());
	
	System.out.println(sortedNames);
	
	//to get whole player object use custom sorted
	Comparator<Player> ageComparator = Comparator.comparing(Player::getAge);
	
	Comparator<Player> reverAgeComparator = (p1,p2) -> Integer.valueOf(p1.getHobbies().size()).compareTo(Integer.valueOf(p2.getHobbies().size()));
	
	List<Player> sortedPlayers = PlayerDB.fetchPlayers().stream()
								//.sorted(Comparator.comparing(Player::getName))
								//.sorted()
								//.sorted(ageComparator)
								.sorted(reverAgeComparator)
								.collect(Collectors.toList());
	
	sortedPlayers.forEach(System.out::println);
	}

}
