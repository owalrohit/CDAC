package in.cdac;

//3) Write a program that performs arithmetic operations involving different data types (int, double, float) 
//and observes how Java handles widening conversions automatically.

public class Assgn4Q3 {

	public static void main(String[] args) {
		int num1 =10;
		float num2 = 20.25f;
		double num3 = 30.08d;
		
		
		int result1 = (int) (num1+num2);	//explcit typecasting needed
		System.out.println("int + float  : "+result1);
		
		float result2 = num1+num2;	
		System.out.println("int + float  : "+result2);
		
		double result3 = num1+num2;	
		System.out.println("int + float  : "+result3);
		
		float result4 = (float)(num2+num3);	
		System.out.println("float + double  : "+result4);
		
		double result5 = num1+num3;	
		System.out.println("int + double  : "+result5);
		
		Integer i = new Integer(result1);
	}
}


/*
 * int + float  : 30
int + float  : 30.25
int + float  : 30.25
float + double  : 50.33
int + double  : 40.08
*/
