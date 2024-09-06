package day3;

public class B6 {

	public static void main(String[] args) {
		
		/*
		 * b. Write a program to test how many bytes are used to represent a float value using the BYTES field. 
		 * (Hint: Use Float.BYTES).
		 */
		System.out.println("bytes used to represent float value : "+Float.BYTES);
		
		/*	
		* c. Write a program to find the minimum and maximum values of float using the MIN_VALUE 
		* and MAX_VALUE fields. (Hint: Use Float.MIN_VALUE and Float.MAX_VALUE).
		 */
		System.out.println("max value of float is : "+Float.MAX_VALUE);

		System.out.println("min value of float is : "+Float.MIN_VALUE);

		/*
		d. Declare a method-local variable number of type float with some value 
		and convert it to a String using the toString method. 
		(Hint: Use Float.toString(float)).
		*/
		float fl = 234.45f;
		String str = Float.toString(fl);
		System.out.println("value of "+fl+ " in string format "+str);

		/*
		* e. Declare a method-local variable strNumber of type String with some value 
		*and convert it to a float value using the parseFloat method. 
		*(Hint: Use Float.parseFloat(String)).
		*/
		String strNumber = "2356";
		float floatNumber = Float.parseFloat(strNumber);
		System.out.println("value of string "+strNumber+" in float "+floatNumber);
		
		
		/*
		* f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" 
		* and attempt to convert it to a float value. 
		* (Hint: parseFloat method will throw a NumberFormatException).
		*/
		
		
		/*
		* g. Declare a method-local variable number of type float with some value 
		* and convert it to the corresponding wrapper class using Float.valueOf(). 
		* (Hint: Use Float.valueOf(float)).
		*/
		float fld = 1234.34f;
		Float float1 = Float.valueOf(fld);
		System.out.println("value of float "+fld+" after converting to the wrapper class :  ");


		/*
		* h. Declare a method-local variable strNumber of type String with some float value 
		* and convert it to the corresponding wrapper class using Float.valueOf(). 
		* (Hint: Use Float.valueOf(String)).
		*/
		String an = "35456.234f";
		float an1 = Float.valueOf(an);
		System.out.println("string "+an+" after converting to the Float wrapper class "+an1);


		/*
		i. Declare two float variables with values 112.3 and 984.5, 
		and add them using a method from the Float class. 
		(Hint: Use Float.sum(float, float)).

		*/
		float as = 112.3f;
		float aw = 984.5f;
		float sum=Float.sum(aw, as);
		System.out.println("the sum is : " + sum);
		
		
		/*
		j. Declare two float variables with values 112.2 and 556.6, 
		and find the minimum and maximum values using the Float class. 
		(Hint: Use Float.min(float, float) and Float.max(float, float)).
		*/
		float fm = 112.2f;
		float fn = 556.6f;
		System.out.println("max value between "+fm+" and "+fn+" is : "+Float.max(fm, fn));
		System.out.println("min value between "+fm+" and "+fn+" is : "+Float.min(fm, fn));
		
		
		
		/*
		k. Declare a float variable with the value -25.0f. 
		Find the square root of this value. (Hint: Use Math.sqrt() method).
		*/
		float sq = 25.32f;
		float sqrt = (float) Math.sqrt(sq);
		System.out.println("sqrt is : "+sqrt);
		
		/*
		l. Declare two float variables with the same value, 0.0f, and divide them. 
		(Hint: Observe the result and any special floating-point behavior).
		*/
		float flt1 = 0.0f;
		float flt2 = 0.0f;
		float result = flt1/flt2;
		System.out.println("result of divide is : "+result);//result of divide is : NaN
		
		
		//m. Experiment with converting a float value into other primitive types or vice versa and observe the results.
		float fltr = 2342.343f;
		byte bt = (byte) fltr;
		char ch = (char) fltr;
		short sh = (short) fltr;
		int in = (int) fltr;
		double dl = fltr;
		long lg =(long) fltr;
		
		
		System.out.println("value of float "+fltr+" to byte is : "+bt);
		System.out.println("value of float "+fltr+" to char is : "+ch);
		System.out.println("value of float "+fltr+" to short is : "+sh);
		System.out.println("value of float "+fltr+" to int  is : "+in);
		System.out.println("value of float "+fltr+" to double is : "+dl);
		System.out.println("value of float "+fltr+" to long is : "+lg);
		
		
		
		
		
	}
}
