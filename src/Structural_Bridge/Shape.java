package Structural_Bridge;

public abstract class Shape {

	public Shape() {
		// TODO Auto-generated constructor stub
	}

		   protected DrawAPI drawAPI;
		   
		   protected Shape(DrawAPI drawAPI){
		      this.drawAPI = drawAPI;
		   }
		   public abstract void draw();	

}
