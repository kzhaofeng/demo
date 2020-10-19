package cola;

public abstract class ColaEmployee {
	private String name;
	private int month;
	
	public int getMonth() {
		return month;
	}
	
	public ColaEmployee() {
		
	}
	
	
	public ColaEmployee(String name,int month) {
		this.name=name;
		this.month=month;
		
	}
	
	public abstract double getSalary(int month);

}
