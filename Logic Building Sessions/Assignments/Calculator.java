/*
Write a program that acts as a simple calculator. It should accept two numbers and an operator 
(+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested if
else to check if division by zero is attempted and display an error message. 
*/

class Calculator{
	public static void main(String args[]){
		double a =10;
		double b=0;
		char operator = '/';
		
		switch(operator){
			case '+' : double c = a+b;
						System.out.println("Result of Addition is "+c);
						break;
			case '-' : c = a-b;
						System.out.println("Result of Subtraction is "+c);
						break;
			case '*' : c = a*b;
						System.out.println("Result of Multiplication is "+c);
						break;
			case '/' : if(b==0){
						System.out.println("division by zero not allowed");
						}else{
						c = a/b;
						System.out.println("Result of Division is "+c);
						}break;
			
		}
	
	}
}