package oops_assignments;

abstract class Shape{
	abstract void draw();
	
}
class Line extends Shape{
	public void draw() {
		System.out.println("line is creating");
		
	}
	
}
class Rectangle extends Shape{
	public void draw() {
		System.out.println("rectangle is Drawing");
	}
	
}
class Cube extends Shape{
	public void draw() {
		System.out.println("cube is drawing");
	}
	
}

public class Que_5 {

	public static void main(String[] args) {
		Shape s= new Line();
		s.draw();
		Cube c= new Cube();
		c.draw();
		Rectangle r= new Rectangle();
		r.draw();
		
	}

}
