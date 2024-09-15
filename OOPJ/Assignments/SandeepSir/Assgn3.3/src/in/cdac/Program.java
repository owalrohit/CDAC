package in.cdac;

import java.util.Scanner;

class BMITracker {
	
	private float weight;
	private float height;
	private float bmi;
	
	Scanner sc = new Scanner(System.in);
	public void acceptRecord() {
		System.out.println("enter height : ");
		this.height=sc.nextFloat();
		System.out.println("enter weight : ");
		this.weight=sc.nextFloat();
	}


	public float calculateBMI() {
		bmi = weight / ( height * height );
		return bmi;
	}


	public void classifyBMI() {
		if(bmi<18.5) {
			System.out.println("underweight : "+bmi);
		}else if(bmi>=18.5 && bmi <24.9) {
			System.out.println("Normal weight : "+bmi);
		}else if(bmi>=25 && bmi <29.9) {
			System.out.println("Overweight : "+bmi);
		}else {
			System.out.println("obessed :"+bmi);
		}
	}


	public void printRecord() {
		System.out.println("weight : "+weight);
		System.out.println("height : "+height);
		System.out.println("BMI : "+bmi);
	}

}

public class Program {
	public static void main(String[] args) {
		
		BMITracker bmiTracker = new BMITracker();
		bmiTracker.acceptRecord();
		bmiTracker.calculateBMI();
		bmiTracker.classifyBMI();
		bmiTracker.printRecord();
		
		
	}


}
