package org.client;
import org.test.*;
import org.test.*;

public class Client {
private void clId() {
	System.out.println("Client id is 1000");
}
private void cliName() {
	System.out.println("Clent name is Rajiv");
}
public static void main(String[] args) {
	Client cl=new Client();
	cl.clId();
	cl.cliName();
	Employee e=new Employee();
	e.empId();
	e.empName();
	Company c=new Company();
	c.compName();
	c.compId();
}
}
