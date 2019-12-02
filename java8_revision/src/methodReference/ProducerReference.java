package methodReference;

import java.util.Arrays;
import java.util.function.Consumer;

import bean.CategoryLevel;
import bean.Player;

public class ProducerReference {

	public static void main(String[] args) {

		Consumer<String> c =  i -> System.out.println(i.toUpperCase());
		c.accept("mesis is sbest");
		
		Consumer<String> c1= System.out :: println;
		c1.accept("mesis is sbest");
		
		Player pa = new Player("messi", 10,
				Arrays.asList("god","running", "gym","family" ),
				32, CategoryLevel.A,11);
		
		Consumer<Player> cp = Player::print;
		cp.accept(pa);
	}

}
