package sept_6;

import java.util.Scanner;

class Employee{
	int empId;      //instance variable
	String empName; //instance variable
	long mobNumber; //instance variable
	
	
	public void acceptRecords() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee id : ");
		this.empId = sc.nextInt();
		System.out.print("Enter employee name : ");
		this.empName=sc.next();
		System.out.print("Enter employee mobile number : ");
		this.mobNumber=sc.nextLong();
		
	}
	
	public void displayRecords() {
		System.out.println("emplyee details are id : "+empId+" name:  "+empName+" mob : "+mobNumber);
	}
	
}



public class Program {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		Employee emp2= new Employee();
		Employee emp3= new Employee();
		Employee emp4= new Employee();
		emp1.acceptRecords();
		emp2.acceptRecords();
		emp3.acceptRecords();
		emp4.acceptRecords();
		
		emp1.displayRecords();
		emp2.displayRecords();
		emp3.displayRecords();
		emp4.displayRecords();
		
		
		
		
	}
}
