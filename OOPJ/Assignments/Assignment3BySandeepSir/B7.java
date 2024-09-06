package day3;

public class B7 {

	public static void main(String[] args) {
		/*
		 * b. Write a program to test how many bytes are used to represent a double value using the BYTES field. 
		 * (Hint: Use Double.BYTES).
		 */
		
		System.out.println("bytes used to represent the double : "+Double.BYTES);
		
		/*
		 * c. Write a program to find the minimum and maximum values of double using the MIN_VALUE and MAX_VALUE fields. 
		 * (Hint: Use Double.MIN_VALUE and Double.MAX_VALUE).
		 */
		System.out.println("min value of double is : "+Double.MIN_VALUE);
		System.out.println("max value of double is : "+Double.MAX_VALUE);
		
		/*
		 * 	d. Declare a method-local variable number of type double with some value 
		 * and convert it to a String using the toString method. 
		 * (Hint: Use Double.toString(double)).
		 */
		
		double fl = 234.45f;
		String str = Double.toString(fl);
		System.out.println("value of "+fl+ " in string format "+str);
		
		/*
		 * e. Declare a method-local variable strNumber of type String with some value 
		 * and convert it to a double value using the parseDouble method. 
		 * (Hint: Use Double.parseDouble(String)).
		 */
		
		String strNumber = "2356";
		double floatNumber = Double.parseDouble(strNumber);
		System.out.println("value of string "+strNumber+" in double "+floatNumber);
		
		
		/*
		 * f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a double value. 
		 * (Hint: parseDouble method will throw a NumberFormatException).
		 */
		
		
		/*
		 * g. Declare a method-local variable number of type double with some value 
		 * and convert it to the corresponding wrapper class using Double.valueOf(). 
		 * (Hint: Use Double.valueOf(double)).
		 */
		double d =5644.234d;
		System.out.println("ans of que g : "+Double.valueOf(d));
		
		/*
		 * h. Declare a method-local variable strNumber of type String with some double value and convert it to the corresponding wrapper class using Double.valueOf(). 
		 * (Hint: Use Double.valueOf(String)).
		 */
		String dq ="5644.234d";
		System.out.println("ans of que h : "+Double.valueOf(d));
		
		/*
		 * i. Declare two double variables with values 112.3 and 984.5, and add them using a method from the Double class.
		 */
		
		double d1 = 112.3d;
		double d2 =	984.5d;
		double sum = Double.sum(d1, d2);
		System.out.println("the sum is : "+sum);
		
		/*
		 * j. Declare two double variables with values 112.2 and 556.6, and find the minimum and maximum values using the Double class. 
		 * (Hint: Use Double.min(double, double) and Double.max(double, double)).
		 */
		
		double dm = 112.2f;
		double dn = 556.6f;
		System.out.println("max value between "+dm+" and "+dn+" is : "+Double.max(dm, dn));
		System.out.println("min value between "+dm+" and "+dn+" is : "+Double.min(dm, dn));
		
		
		/*
		 * k. Declare a double variable with the value -25.0. Find the square root of this value. (Hint: Use Math.sqrt() method).
		 */
		double sq = -25.0d;
		double sqrt = Math.sqrt(sq);
		System.out.println("sqrt is : "+sqrt);
		
		/*
		 * l. Declare two double variables with the same value, 0.0, and divide them. 
		 * (Hint: Observe the result and any special floating-point behavior).
		 */
		
		double flt1 = 0.0f;
		double flt2 = 0.0f;
		double result = flt1/flt2;
		System.out.println("result of divide is : "+result);//result of divide is : NaN
		
		/*
		 * m. Experiment with converting a double value into other primitive types or vice versa and observe the results.
		 */
		double dld = 23.34d;
		
		byte bt = (byte) dld;
		char ch = (char) dld;
		short sh = (short) dld;		
		int in = (int)dld;
		float fltr = (float)dld;
		long lg = (long) dld;
		
		System.out.println("value of double "+dld+" to byte is : "+bt);
		System.out.println("value of double "+dld+" to char is : "+ch);
		System.out.println("value of double "+dld+" to short is : "+sh);
		System.out.println("value of double "+dld+" to int  is : "+in);
		System.out.println("value of double "+dld+" to float is : "+fltr);
		System.out.println("value of double "+dld+" to long is : "+lg);
		
	}
}
