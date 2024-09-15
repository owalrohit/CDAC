package in.cdac.main;

import java.util.Scanner;

import in.cdac.util.CiUtil;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		 CiUtil cu = new CiUtil();
		 int choice;
		
		do {
			cu.menuList();
		    choice = sc.nextInt();
			switch(choice) {
			case 1:
				cu.acceptRecord();
				break;	
				
			case 0:
				System.exit(0);
				break;
			case 2:	
				cu.printRecord();
				break;
			}
			
		}while(choice!=0);
		sc.close();
		}
}