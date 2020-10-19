package cola;

public class SalariedEmployee extends ColaEmployee {
	
	private double salary;
	
	public SalariedEmployee() {
		
	}
	
	public SalariedEmployee(String name,int month, double salary) {
		super(name,month);
		this.salary=salary;
		
	}
	
	
	
	public double getSalary(int month) {
		if(getMonth()==month) {
			salary+=100;
		}
		return salary;
	}

}
