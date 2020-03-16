package Abstract;

public class Circle extends Shape {

	private int redius;

	public Circle(String color, int redius) {
		super(color);
		this.redius = redius;
	}

	@Override
	public String toString() {
		return "Circle [redius=" + redius + ", toString()=" + super.toString()+ "]";
	}

	public double getArea() {
	      return 3.1416*redius+redius;
	   }

}
