package collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueP2 {
public static void main(String[] args) {
	PriorityQueue<Integer> a1=new PriorityQueue();
	a1.add(15);
	a1.add(20);
	a1.add(50);
	a1.add(5);
	a1.add(10);
	a1.add(30);
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
