package in.cdac;

import java.util.Scanner;

class TollBoothRevenueManager{
	private float carRate;
	private float truckRate;
	private float motorcycleRate;
	private int noOfCars;
	private int noOfTrucks;
	private int noOfMotorcycle;
	private float revenue;
	
	Scanner sc = new Scanner(System.in);
	
	public void acceptRecord() {
	
	System.out.print("enter number of cars :	");
	this.noOfCars=sc.nextInt();
	System.out.print("enter number of truks :	");
	this.noOfTrucks=sc.nextInt();
	System.out.print("enter number of motorcycle :	");
	this.noOfMotorcycle=sc.nextInt();

	}
	
	public void setTollRates() {
		this.carRate = 50.00f;
		this.motorcycleRate = 30.00f;
		this.truckRate = 100.00f;
	}
	
	public float calculateRevenue() {
		return revenue = (noOfCars*carRate)+(noOfMotorcycle*motorcycleRate)+(noOfTrucks*truckRate);
		
	}
	
	public void printRecord() {
		System.out.println("Revenue collected through all vehicles is Rs: "+revenue);
	}	
	
}

public class Toll {
	public static void main(String[] args) {
		
		TollBoothRevenueManager mgr = new TollBoothRevenueManager();
		mgr.acceptRecord();
		mgr.setTollRates();
		mgr.calculateRevenue();
		mgr.printRecord();
		mgr.sc.close();
		
		
	}
}
