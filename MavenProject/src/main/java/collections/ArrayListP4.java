package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListP4 {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList();
		ArrayList<String> a2=new ArrayList();
		a1.add("Java");
		a1.add("Python");
		a1.add("C++");
		a1.add("Selenium");
		a1.add("JavaScript");
		Collections.sort(a1);
		System.out.println(a1);
		Collections.reverse(a1);
		System.out.println(a1);
	}

}
