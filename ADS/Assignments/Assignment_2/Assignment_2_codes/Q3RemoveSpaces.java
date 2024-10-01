class Q3RemoveSpaces{


	static String removeSpace(String str){

		str = str.replaceAll("\\s","");
		return str;
	}


	public static void main(String args [] ){
		
		String str1 = "Hello World";
		String str2 = "  Java   Programming  ";
		
		System.out.println(removeSpace(str1));
		
		System.out.println(removeSpace(str2));
		
	}

}