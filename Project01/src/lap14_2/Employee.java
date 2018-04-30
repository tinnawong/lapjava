package lap14_2;

import lap14_1.MyDate;

public class Employee {
	private String name,position;
	private double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void calBill(int ot,double rate ) {
		this.salary = salary+(ot*rate);
		
	}
	
	public void showDetails(){
		System.out.format("name : %s\nposition : %s\n",name,position);
		System.out.println("salary :"+salary+" baht.");
	}
	
	
	
}
