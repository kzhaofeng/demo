package cola;

public class CompanyTest {

	public static void main(String[] args) {
		 
		ColaEmployee employee=new SalariedEmployee("����",10,5000);
		Company company=new Company();
		company.printSalary(employee,12);

		
		employee=new HourlyEmployee ("����",10,5,170);
		
		company.printSalary(employee,12);
	}

}
