package in.cdac.main;

import java.util.Scanner;

import in.cdac.util.BMIUtil;


public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BMIUtil tu = new BMIUtil();
		int choice;
		do {
			BMIUtil.menuList();
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				tu.acceptRecord();
				
				break;	
			
			case 2:
				tu.bmiCal();
				tu.printRecord();
			
			}
			
		}while(choice!=0);
		sc.close();
		}
}