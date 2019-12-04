package terminalOperations;

import java.util.stream.Collectors;

import bean.Player;
import bean.PlayerDB;

public class Joining2 {

	public static void main(String[] args) {

		String allNames=  PlayerDB.fetchPlayers().stream()
				.map(Player::getName)
					.collect(Collectors.joining(",", "(", ")"));
		System.out.println(allNames);
	}

}
