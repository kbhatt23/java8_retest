package imperativeVsDeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveIntegerDuplicates {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,2,3,1,4,5,6,7,5,6,8,9,10);
		
		//imperative style
		List<Integer> uniqueInts = new ArrayList<Integer>();
		for(int num:nums) {
			if(!uniqueInts.contains(num)) {
				uniqueInts.add(num);
			}
		}
		
		System.out.println("imperative style "+uniqueInts);
		
		//declarative style
		//method1
		uniqueInts = uniqueInts.stream().distinct().collect(Collectors.toList());
		System.out.println("declarative way1 "+uniqueInts);
		
		Set<Integer> setUnique = uniqueInts.stream().collect(Collectors.toSet());
		System.out.println("declarative way2 "+setUnique);
	}

}
