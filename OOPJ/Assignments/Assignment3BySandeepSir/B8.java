package day3;

import java.util.Scanner;

/*
 * 8. Conversion between Primitive Types and Strings
	Initialize a variable of each primitive type with a user-defined value and convert it into String:	
	o	First, use the toString method of the corresponding wrapper class. (e.g., Integer.toString()).
	o	Then, use the valueOf method of the String class. (e.g., String.valueOf()).

 */


public class B8 {

	public static void main(String[] args) {
		
		boolean bl = true;
		byte bt = 23;
		char ch = 'e';
		short sh = 231;
		int in =324;
		float fl = 234.342f;
		double dl = 2423.234d;
		long lg = Long.valueOf(in);
		
		String str = Boolean.toString(bl);
		String string  = Byte.toString(bt);
		String string2 = Character.toString(ch);
		String string3 = Short.toString(sh);
		String string4 = Integer.toString(in);
		String string5 = Float.toString(fl);
		String string6 = Double.toString(dl);		
		String string7 = Long.toString(lg);		
		
		System.out.println("boolean to string conversion : "+str);
		System.out.println("byte to string conversion : "+string);
		System.out.println("char to string conversion : "+string2);
		System.out.println("short to string conversion : "+string3);
		System.out.println("int to string conversion : "+string4);
		System.out.println("float to string conversion : "+string5);
		System.out.println("double to string conversion : "+string6);
		System.out.println("long to string conversion : "+string7);
		
		
		String str1 = String.valueOf(bl);
		String st  = String.valueOf(bt);
		String st1 = String.valueOf(ch);
		String st2 = String.valueOf(sh);
		String st3 = String.valueOf(in);
		String st4 = String.valueOf(fl);
		String st5 = String.valueOf(dl);		
		String st6 = String.valueOf(lg);
		
		
		System.out.println("boolean to string conversion using valueOF  : "+str1);
		System.out.println("byte to string conversion using valueOF  : "+st);
		System.out.println("char to string conversion using valueOF  : "+st1);
		System.out.println("short to string conversion using valueOF  : "+st2);
		System.out.println("int to string conversion using valueOF  : "+st3);
		System.out.println("float to string conversion using valueOF  : "+st4);
		System.out.println("double to string conversion using valueOF  : "+st5);
		System.out.println("long to string conversion using valueOF  : "+st6);
		
	}
}
