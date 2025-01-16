package practice;import java.util.Arrays;
import java.util.Collections;

public class StringArray {
	public static void main(String[] args) {
		String[] names= {"sriaknth", "ramesh", "suresh", "Mahesh","Akhil"};
		System.out.println("Array before sorting: "+Arrays.toString(names));
		Arrays.sort(names);
		System.out.println("Array after sorting in ascending order: "+Arrays.toString(names));
		Arrays.sort(names, Collections.reverseOrder());
		System.out.println("Array after sorting in descending order: "+Arrays.toString(names));
	}

}
