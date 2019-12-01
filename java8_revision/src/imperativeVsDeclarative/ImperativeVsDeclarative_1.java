package imperativeVsDeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative_1 {

	public static void main(String[] args) {

		//imperative: old way, how to do the task step by step
		
		int sum =0 ;
		for(int i=0;i<100;i++) {
			sum=sum+i;
		}
		System.out.println("old way "+sum);
		
		//functional: new way, what to do
		System.out.println("new way "+IntStream.range(0, 100).sum());
		//multiplication
		/*int mul = 1;
		int[] nums = {2,4,7,8};
		for(int i=0;i<nums.length;i++) {
			mul = mul *nums[i];
		}
		System.out.println(mul);*/
		
		int mul=1;
		for(int i=1; i<11 ; i++) {
			mul = mul *i;
		}
		System.out.println(mul);
	}

}
