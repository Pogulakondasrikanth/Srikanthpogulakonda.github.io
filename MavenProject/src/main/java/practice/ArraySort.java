package practice;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
	public static void main(String[] args) {
		Integer[] numbers= {9,7,10,2,8,20,12};
		
		System.out.println("array values before sorting: "+Arrays.toString(numbers));
		//sorting an array
		Arrays.sort(numbers);
		System.out.println("after sorting an array in ascending order: "+Arrays.toString(numbers));
		
		//sorting an array in descending order
		Arrays.sort(numbers, Collections.reverseOrder());
		System.out.println("after sorting an array in descending order: "+Arrays.toString(numbers));
		
	}

}
