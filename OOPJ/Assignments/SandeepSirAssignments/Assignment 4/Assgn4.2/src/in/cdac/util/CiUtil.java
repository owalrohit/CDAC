package in.cdac.util;

import java.util.Scanner;

import in.cdac.pojo.CompoundInterestCalculator;

public class CiUtil {
	
CompoundInterestCalculator cc = new CompoundInterestCalculator();
Scanner sc = new Scanner(System.in);
public void acceptRecord() {
	
	System.out.println("enter investment value : 	");
	cc.setPrincipal(sc.nextFloat());
	System.out.println("enter annual interest rate : 	");
	cc.setAnnualInterestRate(sc.nextFloat());
	System.out.println("enter compund times : 	");
	cc.setNumberOfCompounds(sc.nextInt());
	System.out.println("enter investment duaration : 	");
	cc.setYears(sc.nextInt());
}

public double calculateFutureValue() {
	double futureValue = cc.getPrincipal() * Math.pow((1 + cc.getAnnualInterestRate() / cc.getNumberOfCompounds()),(cc.getNumberOfCompounds() * cc.getYears()));
    double totalInterest = futureValue-cc.getPrincipal();
    System.out.printf("future value : ₹%.2f\\n",futureValue);
	return totalInterest;
}
public void printRecord() {
	double value = calculateFutureValue();
	System.out.printf("total intereset : ₹%.2f\n",value);
}
public  void menuList(){
	System.out.println("enter your choice :   ");
	System.out.println("1. enter details :  ");
	System.out.println("2. print details :  ");
	System.out.println("0. exit :  ");
}


}


