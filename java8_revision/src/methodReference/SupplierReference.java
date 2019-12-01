package methodReference;

import java.util.function.Supplier;

import bean.Player;

public class SupplierReference {

	public static void main(String[] args) {

		Supplier<Player> sp =() -> new Player();
		
		Supplier<Player> sp1 = Player::new;
		System.out.println(sp1.get());
	}

}
