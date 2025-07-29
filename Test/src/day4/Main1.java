package day4;

public class Main1 {

	public static void main(String[] args) {
	       Employee emp = new Employee();
		   emp.setEmployeeId(1001);
		   emp.setEmployeeName("Priya Natarajan");
		   emp.setSalary(75000.00);
		   int id = emp.getEmployeeId();
		   String name = emp.getEmployeeName();
		   double salary = emp.getSalary();
		   System.out.println("Employee ID: " + id);
		   System.out.println("Employee Name: " + name);
		   System.out.println("Salary: ₹" + salary);
		    }
		


	}