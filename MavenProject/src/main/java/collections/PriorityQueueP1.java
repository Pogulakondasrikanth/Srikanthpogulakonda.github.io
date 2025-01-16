package collections;

import java.util.PriorityQueue;

public class PriorityQueueP1 {
	public static void main(String[] args) {
		PriorityQueue<String> a1=new PriorityQueue();
		a1.add("Java");
		a1.add("C++");
		a1.add("Selenium");
		a1.add("Python");
		a1.add("AWS");
		a1.add("SQL");
		System.out.println(a1);
		System.out.println(a1.peek());
		System.out.println(a1);
		System.out.println(a1.poll());
		System.out.println(a1);
		while(a1.peek()!=null) {
			System.out.println(a1.poll());
		}
		System.out.println(a1);
		
	}

}
