package Abstract;



public class Rectangle extends Shape {
	private int length, width;

	public Rectangle(int length, int width, String color) {
		super(color);
		this.length = length;
		this.width = width;
	}

	

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}



	@Override
	   public double getArea() {
	      return length*width;
	   }
	

}
