package in.cdac;

//4) Write a Program that demonstrates widening conversion from int to (double,float, boolean, string)  
//and prints the result.

public class Assgn4Q5 {

	public static void main(String[] args) {
		int number = 10;
		double d = number;
		float f = number;
		boolean bool = (number !=0);
		String str = Integer.toString(number);
		
		System.out.println("int to double : "+d);
		System.out.println("int to float : "+f);
		System.out.println("int to boolean : "+bool);
		System.out.println("int to String : "+str);
		
	}
}
/*
output=
int to double : 10.0
int to float : 10.0
int to boolean : true
int to String : 10
*/