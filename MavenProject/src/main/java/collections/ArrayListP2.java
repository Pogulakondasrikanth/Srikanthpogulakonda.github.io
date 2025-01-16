package collections;

import java.util.ArrayList;

public class ArrayListP2 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add("Java");
	a1.add(111);	//a1.add(Integer.valueOf(111)
	a1.add(66.5f);	//a1.add(Float.valueOf(66.5f)
	a1.add('A');	//a1.add(Character.ValueOf('A')
	System.out.println("Collection objects are:"+a1);
	a1.add("Java");
	Integer i=new Integer(100);
	a1.add(i);
	System.out.println("After adding duplicates:"+a1);
	a1.add(null);// null objects means programmer is just reserving memory
	System.out.println("After adding null :"+a1);
	a1.remove("Java");
	System.out.println("After removing:	"+a1);
	a1.remove(i);
	System.out.println("After removing numeric object:"+a1);
	System.out.println(a1.get(4));
	a1.set(2, "SQL");
	System.out.println("After setting object:"+a1);
	a1.add(1,"Full Stack Java");
	System.out.println("After adding at particular index:"+a1);
	System.out.println(a1.size());
	ArrayList a2=new ArrayList();
	a2.addAll(a1);
	System.out.println("After copying:"+a2);
	System.out.println(a2.contains("SQL"));
	System.out.println(a1.isEmpty());
	//printing using for loop	
	
	for(int j=0;j<a1.size();j++) {
		System.out.println(a1.get(j));
	}
}

}
