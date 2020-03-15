package Structural_Bridge;

public class Bridge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape redCircle = new Circle(100,100, 10, new RedCircle());
	      redCircle.draw();
	}

}
