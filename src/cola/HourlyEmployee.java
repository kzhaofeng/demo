package cola;

public class HourlyEmployee extends ColaEmployee{
	
	private double hourlySalary;
	private double hours;
	
	public HourlyEmployee() {
		
	}
	
	public HourlyEmployee(String name,int month,double hourlySalary,int hours) {
		super(name,month);
		this.hourlySalary=hourlySalary;
		this.hours=hours;
		
	}
	
	public double getSalary (int month) {
		double salary=0; 
		
		if( (hours-160)>0) {
			
			salary=hourlySalary*160+(hours-160)*hourlySalary*1.5;
		}else {
			salary=hourlySalary*hours;
	}
		if (getMonth()==month) {
			salary+=100;
			}
		return salary;
	}
}
