package upCasting;

public class Process {
	public static void main(String[] args) {
		Login L1=new Login();
		L1.UserDetails();
		L1.UserRegistration();
		Child ch=new Child();
		ch.ChildRegistration();
		ch.UserRegistration();
		//Upcasting
		Login l2=new Child();
		l2.UserDetails();
		l2.UserRegistration();
		//downcasting
		Child ch2=(Child) l2;
		ch2.ChildRegistration();
		ch2.UserDetails();
		ch2.UserRegistration();
		
	}

}
