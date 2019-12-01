package lambdaExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import bean.Human;

public class ComparatorLegacy {

	public static void main(String[] args) {

		Comparator<Human> ch1 = new Comparator<Human>() {
			public int compare(Human h1 , Human h2) {
				return Integer.valueOf(h1.getAge()).compareTo(Integer.valueOf(h2.getAge()));
			}
		};
		List<Human> humans = Arrays.asList(new Human("kanishk", 28), new Human("lapela", 16),new Human("beka", 26));
		
		System.out.println(humans);
		Collections.sort(humans,ch1);
		System.out.println(humans);
	}

}
