package in.cdac.util;

import java.util.Scanner;

import in.cdac.pojo.BMI;

public class BMIUtil {
	
	Scanner sc = new Scanner(System.in);
	
	BMI bmi = new BMI();
	
	public void acceptRecord() {
		System.out.println("enter height : ");
		bmi.setHeight(sc.nextFloat());
		System.out.println("enter weight : ");
		bmi.setWeight(sc.nextFloat());
	}
	public void bmiCal() {
		 float bmiResult = bmi.getWeight()/(bmi.getHeight()*bmi.getHeight());
				if(bmiResult<18.5) {
					System.out.println("underweight : "+bmi);
				}else if(bmiResult>=18.5 && bmiResult <24.9) {
					System.out.println("Normal weight : "+bmi);
				}else if(bmiResult>=25 && bmiResult <29.9) {
					System.out.println("Overweight : "+bmi);
				}else {
					System.out.println("obessed :"+bmi);
				}
			}

		public void printRecord() {
			System.out.println("weight : "+bmi.getWeight());
			System.out.println("height : "+bmi.getHeight());
			System.out.println("BMI : "+bmi.BmiCal());
		}
	
	
	public static void menuList(){
		System.out.println("enter your choice :   ");
		System.out.println("1. get bmi  ");
		System.out.println("2. calculate bmi  ");
	
	}



}
