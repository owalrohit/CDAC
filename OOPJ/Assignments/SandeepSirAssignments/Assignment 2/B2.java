package day3;

public class B2 {

	public static void main(String[] args) {
		//b. Write a program to test how many bytes are used to represent a byte value using the BYTES field. (Hint: Use Byte.BYTES).
		byte b = Byte.BYTES;
		System.out.println(b);
		System.out.println(Byte.BYTES);
		System.out.println("------------------------------------");
		
		//c. Write a program to find the minimum and maximum values of byte using the MIN_VALUE and MAX_VALUE fields. (Hint: Use Byte.MIN_VALUE and Byte.MAX_VALUE).
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println("------------------------------------");
		
		//d. Declare a method-local variable number of type byte with some value and convert it to a String using the toString method. (Hint: Use Byte.toString(byte)).
		byte number = 10;
		String num = Byte.toString(number);
		System.out.println(num);
		System.out.println("------------------------------------");
		
		//e. Declare a method-local variable strNumber of type String with some value and convert it to a byte value using the parseByte method. (Hint: Use Byte.parseByte(String)).
		String strNumber = "123";
		byte strNumber1 = Byte.parseByte(strNumber);
		System.out.println(strNumber1);
		System.out.println("------------------------------------");

		//f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a byte value. (Hint: parseByte method will throw a NumberFormatException).
		//here it throw NumberFormatException
		
		//g. Declare a method-local variable number of type byte with some value and convert it to the corresponding wrapper class using Byte.valueOf(). (Hint: Use Byte.valueOf(byte)).
		byte by = 23;
		Byte by1 = Byte.valueOf(by); // to convert premitive to wrapper always use valueOf() method
		System.out.println(by1);
		System.out.println("------------------------------------");
		
		//h. Declare a method-local variable strNumber of type String with some byte value and convert it to the corresponding wrapper class using Byte.valueOf(). (Hint: Use Byte.valueOf(String)).
		String str = "12";
		Byte by2 = Byte.valueOf(str);
		System.out.println(by2);
		System.out.println("------------------------------------");
		
		//i. Experiment with converting a byte value into other primitive types or vice versa and observe the results.
		byte ro = -110;
		
		short s1 = ro;
		System.out.println("conversion of byte to short : "+s1);
		byte s2 =(byte)s1;//here use type casting beacause we converting bigger data type to smaller 
		System.out.println("short to byte conversion : "+s2);
		
		int i1 = ro;
		System.out.println("conversion of byte to int : "+i1);
		byte i2 = (byte)i1;
		System.out.println("cconversion of int to byte : "+i2);
		
		float f1 = ro;
		System.out.println("conversion of byte to float : "+f1);
		byte f2 = (byte)f1;
		System.out.println("conversion of float to byte: "+f2);
		
		double d1 = ro;
		System.out.println("conversion of byte to double : "+f1);
		byte d2 = (byte)d1;
		System.out.println("conversion of double to byte: "+d2);
		
		long l1 = ro;
		System.out.println("conversion of byte to long : "+l1);
		byte l2 = (byte)l1;
		System.out.println("conversion of long to byte: "+l2);
		
		
		char ch = (char) ro;
		System.out.println("byte to char conversion : "+ch);
		byte bc = (byte) ch;
		System.out.println("char to byte conversion : "+bc);
		
		//String is non-premitive
		
//		
//		String sd = String.valueOf(ro);
//		System.out.println("byte to string : "+sd);
//		byte sd1 = Byte.valueOf(sd);
//		System.out.println("string to byte : "+sd1);
//		
	
		
		
		
		
		
	}
}
