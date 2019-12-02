package bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayerDB {
	public static List<Player> fetchPlayers() {
		Player p = new Player("messi", 10,
				Arrays.asList("god","running", "gym","family" ),
				32, CategoryLevel.A,108);
		
		Player pfake = new Player("messi", 100,
				Arrays.asList("god","running", "gym","family" ),
				62, CategoryLevel.D,10);
		
		Player p1 = new Player("xavi", 6,
				Arrays.asList("god","eating", "teaching","family" ),
				40, CategoryLevel.A,28);
		
		Player p2 = new Player("iniesta", 8,
				Arrays.asList("gym","running", "talking","family" ),
				37, CategoryLevel.A , 50);
		
		Player p3 = new Player("busquets", 5,
				Arrays.asList("comedy","talking", "songs","family" ),
				32, CategoryLevel.A,12);
		
		Player p4 = new Player("semedo", 2,
				Arrays.asList("god","running", "eating","song","family" ),
				26, CategoryLevel.B, 19);
		
		Player p5 = new Player("perez", 27,
				Arrays.asList("god","running", "gym","family" ),
				22, CategoryLevel.C,16);
		
		Player p6 = new Player("roberto", 22,
				Arrays.asList("god","running", "gym","family" ),
				28, CategoryLevel.B,29);
		
		Player p7 = new Player("suarez", 9,
				Arrays.asList("god","running", "gym","family", "eating","drinking" ),
				32, CategoryLevel.A,64);
		
		Player p8 = new Player("alba", 3,
				Arrays.asList("god","running", "gym","family", "talking", "laughing" ),
				31, CategoryLevel.A,20);
		
		Player p9 = new Player("pep", 10,
				Arrays.asList("god","running", "gym","family" , "teaching" , "coaching" ),
				42, CategoryLevel.A,34);
		
		return Arrays.asList(p,p1,p2,p3,p4,p5,p6,p7,p8,p9,pfake);
		
	}
}
