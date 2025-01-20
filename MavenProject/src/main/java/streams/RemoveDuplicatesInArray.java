package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicatesInArray {
	public static void main(String[] args) {
		Integer[] values= {5,9,7,10,11,4,2};
		
		//sorting array using streams concept
		List<Integer> li=Arrays.asList(values);
		List<Integer> li2=li.stream().distinct().sorted().collect(Collectors.toList());
		for(Integer val:li2) {
			System.out.println(val);
		}
		
	}

}
