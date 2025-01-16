package practice;

import java.util.HashMap;

public class OccurenceOfCharacters {
	public static void main(String[] args) {
		String name="Programming";
		name=name.toLowerCase();
		HashMap<Character,Integer> charactercount=new HashMap<>();
		
		for(char ch:name.toCharArray()) {
			charactercount.put(ch, charactercount.getOrDefault(ch, 0)+1);
		}
		System.out.println("duplicate characters present in a given string are:");
		for(char ch:charactercount.keySet()) {
			if(charactercount.get(ch)>1) {
				System.out.println(ch+" appears "+charactercount.get(ch)+" times");	
			}
		}
			
		}
		

}
