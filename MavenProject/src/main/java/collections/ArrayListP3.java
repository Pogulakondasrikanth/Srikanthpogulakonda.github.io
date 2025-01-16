package collections;

import java.util.ArrayList;

public class ArrayListP3 {
public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList();
	a1.add(111);
	a1.add(222);
	System.out.println("Integer ArrayList elements are:"+a1);
	ArrayList<String> a2=new ArrayList();
	a2.add("Java");
	a2.add("SQL");
	System.out.println("String ArrayLit elements are :"+a2);
	ArrayList<Object> a3=new ArrayList();
	a3.addAll(a1);
	a3.addAll(a2);
	System.out.println("Object ArrayList elements are :"+a3);
	for (Object object : a3) {
		System.out.println(object);
		
	}
	
}
}
