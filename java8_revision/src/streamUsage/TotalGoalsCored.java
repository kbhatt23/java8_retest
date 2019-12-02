package streamUsage;

import bean.Player;
import bean.PlayerDB;

public class TotalGoalsCored {
public static void main(String[] args) {
	int totalgoals=	PlayerDB.fetchPlayers().stream()
				.filter(Player::isPlayerGood)
				.mapToInt(Player::getGoals)
				.sum();
	System.out.println(totalgoals);
	
	int allGoals = PlayerDB.fetchPlayers().stream()
			.filter(Player::isPlayerGood)
			.map(Player::getGoals)
			.reduce(0, (a,b) -> a+b);
	System.out.println(allGoals);
	
	int allGoalsAlternate = PlayerDB.fetchPlayers().stream()
			.filter(Player::isPlayerGood)
			.map(Player::getGoals)
			.reduce(0, Integer::sum);
	System.out.println(allGoalsAlternate);
}
}
