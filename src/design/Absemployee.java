package design;

public abstract class Absemployee implements Employee {
//override calculatesalary
	public int calculateSalary(int reg, int overtime) {
		int total=reg+overtime;
		System.out.println("this is override calculatesalary: "+total);
		return total;
	}

	public abstract void employeeof_cnn_health_dept();
		
	
	

}
