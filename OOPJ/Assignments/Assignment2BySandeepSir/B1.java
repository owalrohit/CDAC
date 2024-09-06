package day3;

public class B1 {
	
	public static void main(String[] args) {
		
		boolean status = true;
		String st = Boolean.toString(status); //converting the boolean to String using Boolean.toString() method.
		System.out.println(st);
		System.out.println(Boolean.valueOf(status));//converting to the Boolean wrapper class
		
		//int st1 = Boolean.valueOf(st1);
		
		String strStatus = "true";
		boolean strStatus1 = Boolean.parseBoolean(strStatus);//for converting from string to boolean we have to use Boolean.parseBoolean()
		System.out.println(st);
		
		String strStatus2 = "1";
		boolean strstatus4 = Boolean.parseBoolean(strStatus2);//here parseBoolean method is not working as expected.
		System.out.println(strstatus4);
	}

}
