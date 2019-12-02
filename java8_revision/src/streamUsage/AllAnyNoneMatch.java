package streamUsage;

import bean.Player;
import bean.PlayerDB;

public class AllAnyNoneMatch {

	public static void main(String[] args) {

		boolean anyMatch = PlayerDB.fetchPlayers().stream()
			.anyMatch(Player::isPlayerGood);
		System.out.println(anyMatch);
		
		System.out.println(PlayerDB.fetchPlayers().stream()
				.anyMatch(player -> player.getHobbies().size() > 8)
				);
		
		System.out.println(PlayerDB.fetchPlayers().stream()
				.noneMatch(player -> player.getHobbies().size() > 5)
				);
		
		System.out.println(PlayerDB.fetchPlayers().stream()
				.allMatch(player -> player.getHobbies().size() > 5)
				);
		
		System.out.println(PlayerDB.fetchPlayers().stream()
				.allMatch(player -> player.getHobbies().size() > 3)
				);
		
	}

}
