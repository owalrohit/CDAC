package in.cdac;

import java.util.Scanner;

class CompoundInterestCalculator{
	private float principal;
	private float annualInterestRate;
	private int numberOfCompounds;
	private int years;
	private float futureValue; 
	private float  totalInterest ;
	
	Scanner sc = new Scanner(System.in);
	public void acceptRecord() {
		
		System.out.println("enter investment value : 	");
		this.principal = sc.nextFloat();
		System.out.println("enter annual interest rate : 	");
		this.annualInterestRate = sc.nextFloat();
		System.out.println("enter compund times : 	");
		this.numberOfCompounds = sc.nextInt();
		System.out.println("enter investment duaration : 	");
		this.years = sc.nextInt();
	}
	
	public float calculateFutureValue() {
		futureValue = (float) (principal * Math.pow((1 + annualInterestRate / numberOfCompounds),(numberOfCompounds * years)));
		return totalInterest = futureValue-principal;
		
	}
	public void printRecord() {
		System.out.println("future value : "+futureValue);
		System.out.println("total intereset : "+totalInterest);
	}
	
	
}



public class Program {
	public static void main(String[] args) {
	
		CompoundInterestCalculator cl = new CompoundInterestCalculator();
		cl.acceptRecord();
		cl.calculateFutureValue();
		cl.printRecord();
		
	}
}
