package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DuplicateElementsInAnArray {
	public static void main(String[] args) {
		String[] names=new String[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the "+names.length+"names to store into an array");
		for(int i=0;i<names.length;i++) {
		names[i]=sc.nextLine();
			
		
		
		
	}
		System.out.println(Arrays.toString(names));
		List<String> li=Arrays.asList(names);
		li.stream().distinct().sorted().forEach(s->System.out.println(s));
		
	}
}
