package in.cdac;

import java.util.Scanner;

class DiscountCalculator{
	private float originalPrice;
	private float discountRate;
	private float discountAmount;
	private float finalPrice;
	
	Scanner sc = new Scanner(System.in);
	public void acceptRecord() {
		System.out.println("enter original price : ");
		this.originalPrice=sc.nextFloat();
		System.out.println("enter discount rate : ");
		discountRate = sc.nextFloat();
		
	}
	
	public void calculateDiscount() {
		discountAmount = originalPrice*(discountRate/100);
		finalPrice = originalPrice-discountAmount;	
	}
	
	public void printRecord() {
		System.out.println("original price Rs: "+originalPrice);
		System.out.println("discount rate Rs: "+discountRate);
		System.out.println("discount amount Rs: "+discountAmount);
		System.out.println("discount final price Rs: "+finalPrice);
		
	}	
	
}

public class Program {
	public static void main(String[] args) {
		
		DiscountCalculator dc = new DiscountCalculator();
		dc.acceptRecord();
		dc.calculateDiscount();
		dc.printRecord();
	}
}
