package cola;

public class Company {
	
	public void printSalary(ColaEmployee employee,int month) {
		double salary=employee.getSalary(month);
		
		System.out.println("salary=="+salary);
	}

}
