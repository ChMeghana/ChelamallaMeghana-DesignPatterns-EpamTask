package Creational_factory;

public class FactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory Factory = new Factory();
	      Shape shape1 = Factory.getShape("--CIRCLE--");
	      shape1.draw();
	      Shape shape2 = Factory.getShape("--RECTANGLE--");
	      shape2.draw();
	      Shape shape3 = Factory.getShape("--SQUARE--");
	      shape3.draw();
	}

}
