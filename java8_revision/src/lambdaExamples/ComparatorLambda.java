package lambdaExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import bean.Human;

public class ComparatorLambda {

	public static void main(String[] args) {
List<Human> humans = Arrays.asList(new Human("kanishk", 28), new Human("lapela", 16),new Human("beka", 26));
		
		System.out.println(humans);
		Collections.sort(humans, (h1,h2) ->  h1.getName().compareTo(h2.getName()));
		
		System.out.println(humans);
	}

}
