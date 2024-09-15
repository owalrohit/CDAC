package in.cdac;

import java.util.Scanner;

class Loan{
	
	private float principal;           //instance fields gets memory when instance is created
	private float annualInterestRate;		//instance fields gets memory when instance is created
	private int longTerm;			//instance fields gets memory when instance is created
	private double monthlyPayment;
	private int numberOfMonths;
	
	static Scanner sc = new Scanner(System.in);
	public void acceptRecord() {
	System.out.print("Enter loan amount 	:		");
	this.principal = sc.nextFloat();
	System.out.print("Enter Interest rate  	:		");
	this.annualInterestRate = sc.nextFloat();
	System.out.print("Enter loan term 	:		");
	this.longTerm = sc.nextInt();

	

}
public void calculateMonthlyPayment() {
	
	 float monthlyInterestRate = annualInterestRate / 12 / 100;	
	 numberOfMonths = longTerm * 12;	
	 monthlyPayment = (float) (principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) / (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1));
	 }

public void printRecord() {	
	System.out.println("Monthly payment :    "+ monthlyPayment);
	System.out.println("Total loan amount paid "+ (monthlyPayment*numberOfMonths));
}

}

public class LoanCalculator {
	public static void main(String[] args) {
		
		
		Loan loan = new Loan();
		loan.acceptRecord();
		loan.calculateMonthlyPayment(); 
		loan.printRecord();
				
   }
}
