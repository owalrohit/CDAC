/*
Write a program that uses a nested switch statement to print out the day of the week based on an 
integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it 
is a weekday or weekend. 
*/


import java.util.Scanner;
class DaysOfTheWeek{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the day number : ");
		int day = sc.nextInt();
			
		switch(day){
			case 1: System.out.println("Monday");
					System.out.println("It is a weekday");
					break;
					
			case 2: System.out.println("Tuesday");
					System.out.println("It is a weekday");
					break;
					
			case 3: System.out.println("Wednesday");
					System.out.println("It is a weekday");
					break;
					
			case 4: System.out.println("Thursday");
					System.out.println("It is a weekday");
					break;
					
			case 5: System.out.println("Friday");
					System.out.println("It is a weekday");
					break;
					
			case 6: System.out.println("Saturday");
					System.out.println("It is a weekend");
					break;
					
			case 7: System.out.println("Sunday");
					System.out.println("It is a weekend");
					break;
					
			default:System.out.println("Enter valid input");
					break;
					
			
			
	}}	
}