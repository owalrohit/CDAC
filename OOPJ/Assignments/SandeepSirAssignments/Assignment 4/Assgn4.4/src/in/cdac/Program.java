package in.cdac;

import java.util.Scanner;

class DiscountCalculator {
	double originalPrice;
	float discountPercentage;
	
	//parameterless constructor
	public DiscountCalculator() {
	
	}
	//parameterized constructor
	public DiscountCalculator(double originalPrice, float discountPercentage) {
		super();
		this.originalPrice = originalPrice;
		this.discountPercentage = discountPercentage;
	}

	public double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public float getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(float discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
	@Override
	public String toString() {
		return "DiscountCalculator [originalPrice=" + originalPrice + ", discountPercentage=" + discountPercentage
				+ "]";
	}
	
	 // Method to calculate the discount amount
    public double calculateDiscountAmount() {
        return originalPrice * (discountPercentage / 100);
    }
    
    //method to calculate final price
    public double finalPrice() {
		return originalPrice-calculateDiscountAmount();
    	
    }
    
    
}

class DiscountCalculatorUtil {
	DiscountCalculator dc = new DiscountCalculator();
	Scanner sc = new Scanner(System.in);
	
	public void acceptRecord() {
		System.out.println("enter original price:  ");
		dc.setOriginalPrice(sc.nextDouble());
		System.out.println("enter discount percentage :  ");
		dc.setDiscountPercentage(sc.nextFloat());
	
	}
	
	public void printRecord() {
		System.out.println(dc.toString());
		System.out.printf("discount amount for purchase is :  ₹%.2f\n " , dc.calculateDiscountAmount());
		System.out.printf("final price is : ₹%.2f\n " , dc.finalPrice());
	}
	
	public static void menuList() {
        System.out.println("Discount Calculator Menu:");
        System.out.println("1. Calculate discount and final price");
        System.out.println("2. Exit");
    }
	 
}



	

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			DiscountCalculatorUtil.menuList();
			int choice = sc.nextInt();
		switch(choice) {
		case 1:	
			DiscountCalculatorUtil dcl = new DiscountCalculatorUtil();
			dcl.acceptRecord();
			dcl.printRecord();
			System.out.println("*******************");
			break;
			
		case 2:
			flag=false;
			System.out.println("program terminated...");
	        System.exit(0);
	        
	        default:
	        	System.out.println("invalid input");
		}
		
	}
		sc.close();
		}
}


