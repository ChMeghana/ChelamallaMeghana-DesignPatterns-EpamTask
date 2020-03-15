package Beahvioral_Mediator;

public class MediatorPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      User angella = new User("Angella");
		      User jhonny = new User("Jhonny");

		      angella.sendMessage("Hi! Jhonny!");
		      jhonny.sendMessage("Hello! Angella!");
	}

}
