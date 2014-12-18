class Shape {
    public double area ()
    {
        return 0;     // Since this is just a generic "Shape" we will assume the area as zero.
                    // The actual area of a shape must be overridden by a subclass, as we see below.
                    // You will learn later that there is a way to force a subclass to override a method,
                    // but for this simple example we will ignore that.
    }
}


class Circle extends Shape {                    // class declaration
    Circle (double diameter) {                  // constructor
        this.diameter = diameter;
    }
    private static final double PI = Math.PI;   // constant
    private double diameter;                    // instance variable
    
    public double area () {                     // dynamic method
        double radius = diameter / 2.0;
        return PI * radius * radius;
    }

}


class Rectangle extends Shape {
    Rectangle (double height, double width){
	    this.height = height;
		this.width = width;
    }
	 
	private double height;
	private double width;

	public double area () {
	    double totalArea = height * width;
		return totalArea;
	
    }

}
public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle (2.5);
        Shape s2 = new Rectangle (5.0, 4.0);
        
        System.out.println (s1.area());
        System.out.println (s2.area());
    }
}