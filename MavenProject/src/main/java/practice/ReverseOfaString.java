package practice;

public class ReverseOfaString {
	public static void main(String[] args) {
		System.out.println("By using string builder class:");
		String name="Srikanth";
		StringBuilder reverse=new StringBuilder(name).reverse();
		System.out.println("Given "+name+" to print of it's reverse word: "+reverse);
		System.out.println("By using looping concept:");
		String reverse2="";
		for(int i=name.length()-1;i>=0;i--) {
			reverse2=reverse2+name.charAt(i);
		}
		System.out.println("Given "+name+" to print of it's reverse word: "+reverse2);
	}

}
