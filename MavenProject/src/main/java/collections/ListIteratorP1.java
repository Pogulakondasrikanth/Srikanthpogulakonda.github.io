package collections;

import java.util.*;

public class ListIteratorP1 {
	public static void main(String[] args) {
		ArrayList<String> 	a1=new ArrayList();
		a1.add("Java");
		a1.add("Selenium");
		a1.add("SQL");
		a1.add("Python");
		System.out.println("Objects from forward direction:	");
		ListIterator li=a1.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("Objects from backward direction");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
