class Q8nonRepeated{

	static void isNonRepeated(String str){
		
		boolean flag = true;
		
		for(char i:str.toCharArray()){
			if( str.indexOf(i) == str.lastIndexOf(i)){
					System.out.println("First non-repeating char is : "+i);
					flag = false;
					break;
			}
		}
		if(flag == true){
			System.out.println("no repeating char in given string ...!");
		}
		
	}

	public static void main(String args [] ){
	
		String str = "stress";
		
		isNonRepeated(str);
	
	}

}