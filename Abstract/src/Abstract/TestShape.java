package Abstract;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Rectangle(5, 4, "red");
	      System.out.println(s1);
	      System.out.println("Area is " + s1.getArea());
	       
	      AreaManager am1=new AreaManager();
	        System.err.println(am1.findArea(s1));
	        
	      Shape s2 = new Triangle("blue", 4, 5);
	      System.out.println(s2);
	      System.out.println("Area is " + s2.getArea());
	      
	      AreaManager am2 =new AreaManager();
	        System.err.println(am2.findArea(s2));
	   }
	

	}


