package day3;

public class B3 {

	public static void main(String[] args) {
		//b. Write a program to test how many bytes are used to represent a short value using the BYTES field. 
		//(Hint: Use Short.BYTES).
		System.out.println(Short.BYTES);
	
		//c. Write a program to find the minimum and maximum values of short using the MIN_VALUE and MAX_VALUE fields.
		//(Hint: Use Short.MIN_VALUE and Short.MAX_VALUE).
		short sh1 = Short.MIN_VALUE;
		short sh2 = Short.MAX_VALUE;
		System.out.println("min value of short is : "+sh1);
		System.out.println("max value of short is : "+sh2);
		
		//d. Declare a method-local variable number of type short with some value and 
		//convert it to a String using the toString method. (Hint: Use Short.toString(short)).
		short sn = 6511;
		String sn1 = Short.toString(sn);
		System.out.println("value of String after conversion of short "+sn+" to String is : "+sn1);
		
//		int a = Integer.parseInt(sn1);
//		System.out.println(a);
//		double d = Double.parseDouble(sn1);
//		System.out.println(d);
	
		//e. Declare a method-local variable strNumber of type String with some value 
		//and convert it to a short value using the parseShort method. (Hint: Use Short.parseShort(String)).
		String strNumber = "2311";
		short sn2 = Short.parseShort(strNumber);
		System.out.println("String "+strNumber+" to short conversion : "+sn2);
//		String sreq= Short.toString(sn2); //String to short conversion using toString()
//		System.out.println(sreq);
		
		/*f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" 
		and attempt to convert it to a short value. 
		(Hint: parseShort method will throw a NumberFormatException).
		*/
		System.out.println("we cannot canvert String = Ab12Cd3 to short beacause it throw exception:  java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)");
		String sdf= "Ab12Cd3";
		//short sf = Short.parseShort(sdf);java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
		
		/*g. Declare a method-local variable number of type short with some value 
		 * and convert it to the corresponding wrapper class using Short.valueOf(). 
		 * (Hint: Use Short.valueOf(short)).
		 */
		
		short number = 656;
		Short srt = Short.valueOf(number);
		System.out.println(srt);
		
		
		/*h. Declare a method-local variable strNumber of type String with some short value 
		 * and convert it to the corresponding wrapper class using Short.valueOf(). 
		 * (Hint: Use Short.valueOf(String)).
		 */
		String strNumber1 = "555";
		System.out.println(Short.valueOf(strNumber1));
		
		
		/*
		 * i. Experiment with converting a short value into other primitive 
		 * types or vice versa and observe the results.
		 */
		
		short shr = 2322;
		byte b = Byte.valueOf((byte) shr);
		int a = Integer.valueOf(shr);
		float f = Float.valueOf(shr);
		double d = Double.valueOf(shr);
		long l = shr;
		char c = (char)shr;
		System.out.println("short to byte : "+b);
		System.out.println("short to int : "+a);
		System.out.println("short to float : "+f);
		System.out.println("short to double : "+d);
		System.out.println("short to long : "+l);
		System.out.println("short to char : "+c);
		
		short sdr = b;
		short sdr1 = (short)a;
		short sdr2 = (short) f;
		short sdr3 = (short) d;
		short sdr4 = (short) l;
		short sdr5 = (short) c;
		
		System.out.println("byte to short : "+sdr);
		System.out.println("int to short : "+sdr1);
		System.out.println("float to short : "+sdr2);
		System.out.println("double to short : "+sdr3);
		System.out.println("long to short : "+sdr4);
		System.out.println("char to short : "+sdr5);
		
		short er = 213;
		String er2 = Short.toString(er);
		System.out.println("short to string : "+sdr5);
    	int asd=2147483647;
		short sdfg = (short)asd;
		System.out.println(sdfg);
	
		
		
		
		
	}
}
