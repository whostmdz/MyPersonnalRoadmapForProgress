package exoEmployee;

public class Developer extends Employee{
	private final int linesOfCode;
	
	public Developer(String name, double baseSalary,int linesOfCode) {
		super(name, baseSalary);
		this.linesOfCode=linesOfCode;
	}

	@Override
	public  double calculatePay() {
		return getBaseSalary() + (0.10 * linesOfCode);
	}
}
