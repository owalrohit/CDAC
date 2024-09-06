package day3;

/*
 * 9. Default Values of Primitive Types
	Declare variables of each primitive type as fields of a class 
	and check their default values. 
	(Note: Default values depend on whether the variables are instance variables or static variables).

 */

public class B9 {
	int a;		//instance variable
	String s;	//instance variable
	double d;	//instance variable
	static 	double dl;  //static variables
	static String s1;
	
	
	public static void main(String[] args) {
	
		B9 b9 = new B9();
		System.out.println(b9.a);
		System.out.println(b9.s);
		System.out.println(b9.d);
		System.out.println(B9.dl);
		System.out.println(B9.s1);
	
	}
}
