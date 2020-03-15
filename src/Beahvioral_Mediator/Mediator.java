package Beahvioral_Mediator;
import java.util.Date;
public class Mediator {
	public static void showMessage(User user, String message){
	      System.out.println(new Date().toString() + " -- " + user.getName() + " -- : " + message);
	   }
}
