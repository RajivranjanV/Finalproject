package org.test;

public class Company {
	public void compId() {
	System.out.println("Company id is 120");
}
	public void compName() {
	System.out.println("Company name is TCS");
}
public static void main(String[] args) {
	Company c=new Company();
	c.compId();
	c.compName();
	Employee e=new Employee();
	e.empId();
	e.empName();
	System.out.println("page2");
	
}
}
