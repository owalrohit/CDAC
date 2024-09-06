package day3;

public class B4 {
 
	public static void main(String[] args) {
		/*
		 * b. Write a program to test how many bytes are used to represent an int value using the BYTES field. 
		 * (Hint: Use Integer.BYTES).
		 */
		
		System.out.println(Integer.BYTES);
		
		
		/*
		 * c. Write a program to find the minimum 
		 * and maximum values of int using the MIN_VALUE and MAX_VALUE fields. 
		 * (Hint: Use Integer.MIN_VALUE and Integer.MAX_VALUE).
		 */
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		System.out.println("min value of int is : "+min+" and max int is : "+max);
		
		/*
		 * d. Declare a method-local variable number of type int with some value 
		 * and convert it to a String using the toString method. 
		 * (Hint: Use Integer.toString(int)).
		 */
		int number = 234;
		String numString = Integer.toString(number);
		System.out.println(numString);
		
		
		/*
		 * e. Declare a method-local variable strNumber of type String with some value 
		 * and convert it to an int value using the parseInt method. 
		 * (Hint: Use Integer.parseInt(String)).
		 */
		String strNumber = "34";
		int nUmber = Integer.parseInt(strNumber);
		System.out.println(nUmber);
		
		/*
		 * f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" 
		 * and attempt to convert it to an int value. 
		 * (Hint: parseInt method will throw a NumberFormatException).
		 */
		
		/*
		 * g. Declare a method-local variable number of type int with some value 
		 * and convert it to the corresponding wrapper class using Integer.valueOf(). 
		 * (Hint: Use Integer.valueOf(int)).
		 */
		int num = 232324;
		Integer numInteger = Integer.valueOf(num);
		System.out.println(numInteger);
		
		
		/*
		 * h. Declare a method-local variable strNumber of type String with some integer value 
		 * and convert it to the corresponding wrapper class using Integer.valueOf(). 
		 * (Hint: Use Integer.valueOf(String)).
		 */
		String string = "532";
		int in = Integer.valueOf(string);
		System.out.println(in);
		
		/*
		 * i. Declare two integer variables with values 10 and 20, 
		 * and add them using a method from the Integer class. 
		 * (Hint: Use Integer.sum(int, int)).
		 */
		int in1 = 10;
		int in2 = 20;
		int sum = Integer.sum(in1, in2);
		System.out.println("the sum is :   "+sum);
		
		
		/*
		 * j. Declare two integer variables with values 10 and 20, 
		 * and find the minimum and maximum values using the Integer class. 
		 * (Hint: Use Integer.min(int, int) and Integer.max(int, int)).
		 */
		System.out.println("min value is : "+Integer.min(10, 20));
		System.out.println("max value is : "+Integer.max(10, 20));
		
		/*
		 * k. Declare an integer variable with the value 7. 
		 * Convert it to binary, octal, and hexadecimal strings using methods from the Integer class. 
		 * (Hint: Use Integer.toBinaryString(int), Integer.toOctalString(int), and Integer.toHexString(int)).
		 */
		int k = 7;
		System.out.println(Integer.toBinaryString(k));
		System.out.println(Integer.toOctalString(k));
		System.out.println(Integer.toHexString(k));
		
		/*
		 * l. Experiment with converting an int value into other primitive types 
		 * or vice versa and observe the results.
		 */
		int ij = 123;
		float fl = ij;
		System.out.println("int to float : "+fl);
		double dl = ij;
		System.out.println("int to double : "+dl);
		long ld = ij;
		System.out.println("int to long : "+ld);
		byte bt = (byte)in;
		System.out.println("int to byte : "+bt);
		short st = (short)in;
		System.out.println("int to short : "+st);
		char ch1 = (char)in;
		System.out.println("int to char : "+ch1);
	}
}
