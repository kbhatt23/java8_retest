package methodReference;

import java.util.Arrays;
import java.util.function.Predicate;

import bean.CategoryLevel;
import bean.Player;

public class PredicateReference {
	static boolean isPlayerGood(Player p) {
		return p.getCategoryLevel() == CategoryLevel.A || p.getCategoryLevel() == CategoryLevel.B;
	}
	public static void main(String[] args) {
		Predicate<Character> isupper = Character::isUpperCase;
		System.out.println(isupper.test('C'));
		
		//way2pl
		Predicate<Player> pPredixate = PredicateReference::isPlayerGood;
		Player p = new Player("messi", 10,
				Arrays.asList("god","running", "gym","family" ),
				32, CategoryLevel.B,23);
		System.out.println(pPredixate.test(p));
		
		//ways
		Predicate<Player> pPredixate1 = Player::isPlayerGood;
		System.out.println(pPredixate1.test(p));
	}

}
