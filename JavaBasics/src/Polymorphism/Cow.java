package Polymorphism;

public class Cow extends Animal{
	public static void main (String[] args) {
		
	}
	@Override //is used to make sure it is written in parent class, if it shows error it means there is a mistake of typo.
	// the purpose of overrid annotation is to make sure the method using in a child class must be available in the parent class
	public void whoisI() {
		System.out.println("This is Cow");

}
}