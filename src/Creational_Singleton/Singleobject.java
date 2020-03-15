package Creational_Singleton;

public class Singleobject {
	private static Singleobject instance = new Singleobject();
	   private Singleobject(){}
	   public static Singleobject getInstance(){
	      return instance;
	   }
	   public void show(){
	      System.out.println("Singleton--Pattern");
	   }
}
