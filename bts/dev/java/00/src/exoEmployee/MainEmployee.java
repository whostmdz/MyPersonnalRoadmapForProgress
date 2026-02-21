package exoEmployee;
import java.util.ArrayList;

public class MainEmployee {
	public static void main(String[] args) {
		ArrayList<Employee> employee = new ArrayList<>();
		Developer d1 = new Developer("Bob", 1200.00, 300);
		Manager m1 = new Manager("Alice", 1600.00, 50.00);
		
		employee.add(d1);
		employee.add(m1);
		
		for(Employee i: employee) {
			System.out.println(i.getName()+ " et "+ i.calculatePay());
		}
	}
}
