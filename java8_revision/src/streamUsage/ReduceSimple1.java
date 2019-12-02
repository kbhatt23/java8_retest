package streamUsage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.Player;
import bean.PlayerDB;

public class ReduceSimple1 {

	public static void main(String[] args) {

		Integer minimum = PlayerDB.fetchPlayers().stream()
			.mapToInt(Player::getAge)
			.min().orElseThrow(() -> new RuntimeException("jai shree ram") );
		System.out.println(minimum);
		System.out.println("------------");
		
		//List<Integer> items= new ArrayList<Integer>() ;
		List<Integer> items = Arrays.asList(2,5,6,3,66,3,1);
		Integer minimum1 = items.stream()
				.mapToInt(i -> i)
				.min().orElseThrow(() -> new RuntimeException("jai shree ram") );
		System.out.println(minimum1);
		
		//using reduce
		int mini = PlayerDB.fetchPlayers().stream()
			.map(Player::getAge)
			.reduce((a,b) -> a>b ? b:a ).get();
		System.out.println(mini);
		
		//get Player with minimum age
		Player miniPlayer =PlayerDB.fetchPlayers().stream()
			.reduce((p1,p2) -> p1.getAge() > p2.getAge() ? p2: p1).orElseThrow(RuntimeException :: new);
		System.out.println(miniPlayer);
	}

}
