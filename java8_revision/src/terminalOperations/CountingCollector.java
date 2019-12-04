package terminalOperations;

import java.util.stream.Collectors;

import bean.PlayerDB;

public class CountingCollector {

	public static void main(String[] args) {
		
		long count = PlayerDB.fetchPlayers().stream()
			.collect(Collectors.counting());
		System.out.println(count);
	}

}
