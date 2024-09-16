package day3;

public class B5 {

	public static void main(String[] args) {
		
		/*
		 * b. Write a program to test how many bytes are used to represent a 
		 * long value using the BYTES field. 
		 * (Hint: Use Long.BYTES).
		 */
		System.out.println("bytes used by long :  "+Long.BYTES);
		
		/*
		 * c. Write a program to find the minimum and maximum values of long using the MIN_VALUE and MAX_VALUE fields. 
		 * (Hint: Use Long.MIN_VALUE and Long.MAX_VALUE).
		 */
		
		System.out.println("max value of long : "+Long.MAX_VALUE);
		System.out.println("min value of long : "+Long.MIN_VALUE);
		
		/*
		 * d. Declare a method-local variable number of type long with some value and convert it to a String using the toString method. 
		 * (Hint: Use Long.toString(long)).
		 */
		long number = 12434;
		System.out.println("string value of "+number+" is "+ Long.toString(number));
		
		/*
		 * e. Declare a method-local variable strNumber of type String with some value 
		 * and convert it to a long value using the parseLong method. 
		 * (Hint: Use Long.parseLong(String)).
		 */
		String strNumber = "12434";
		long ld = Long.parseLong(strNumber);
		System.out.println("string to long conversion : "+ld);
		
		/*
		 * f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a long value. 
		 * (Hint: parseLong method will throw a NumberFormatException).
		 */
		
		
		/*
		 * g. Declare a method-local variable number of type long with some value 
		 * and convert it to the corresponding wrapper class using Long.valueOf(). 
		 * (Hint: Use Long.valueOf(long)).
		 */
		
		long l = 12434;
		System.out.println("wrapper class value : "+Long.valueOf(l));
		
		/*
		 * h. Declare a method-local variable strNumber of type String with some long value 
		 * and convert it to the corresponding wrapper class using Long.valueOf(). 
		 * (Hint: Use Long.valueOf(String)).
		 */
		String string = "12434";
		Long ldr = Long.valueOf(string);
		
		
		/*
		 * i. Declare two long variables with values 1123 and 9845, 
		 * and add them using a method from the Long class. 
		 * (Hint: Use Long.sum(long, long)).
		 */
		long m = 1123;
		long n = 9845;
		long sum = Long.sum(m, n);
		System.out.println("the sum  is :  "+sum);
		
		/*
		 * j. Declare two long variables with values 1122 and 5566, 
		 * and find the minimum and maximum values using the Long class. 
		 * (Hint: Use Long.min(long, long) and Long.max(long, long)).
		 */
		long m1 = 1122;
		long n1 = 5566;
		System.out.println(" max is: "+Long.max(m1, n1));
		System.out.println(" min is: "+Long.min(m1, n1));
		
		
		/*
		 * k. Declare a long variable with the value 7. Convert it to binary, octal, and hexadecimal strings using methods from the Long class. 
		 * (Hint: Use Long.toBinaryString(long), Long.toOctalString(long), and Long.toHexString(long)).
		 */
		long k = 89;
		System.out.println("value of "+k+" in binary is : "+Long.toBinaryString(k));
		System.out.println("value of "+k+" in octal is : "+Long.toOctalString(k));
		System.out.println("value of "+k+" in hexa is : "+Long.toHexString(k));
		
		/*
		 * l. Experiment with converting a long value into other primitive types 
		 * or vice versa and observe the results.
		 */
		long k1 = 90;
		int i1 = (int) k1;
		byte b1 = (byte) k1;
		char ch1 = (char) k1;
		short sh1 = (short) k1;
		double dl1 = k1;
		
		
		
	}
}
