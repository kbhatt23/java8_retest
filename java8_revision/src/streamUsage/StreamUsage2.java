package streamUsage;

import bean.Player;
import bean.PlayerDB;

public class StreamUsage2 {
public static void main(String[] args) {
	PlayerDB.fetchPlayers().stream()
			.map(Player::getName)
			.forEach(System.out::println);
}
}
