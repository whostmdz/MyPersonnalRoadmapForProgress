package shape;
import java.util.ArrayList;

public class MainShape {
	public static void main(String[] args) {
		ArrayList<Shape> forme = new ArrayList<>();
		Rectangle r1 = new Rectangle(10.00, 20.00);
		Circle c1 = new Circle(10.00);

		forme.add(r1);
		forme.add(c1);
		
		for (Shape i: forme) {
			System.out.println(i);
			
		}
		
	}

}
