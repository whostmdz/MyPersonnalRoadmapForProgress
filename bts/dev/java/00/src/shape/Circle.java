package shape;
import java.lang.Math;

public class Circle implements Shape{
	
	private final double radius;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	@Override
	public double computeArea() {
		return Math.PI * Math.pow( radius, 2 );
	}
	
    @Override
    public String toString() {
    	return "area =" + computeArea();
    }
	
}
