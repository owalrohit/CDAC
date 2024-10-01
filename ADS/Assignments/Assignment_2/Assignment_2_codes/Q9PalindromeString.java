class Q9PalindromeString{

	static void reverse(String str){
		
		boolean flag = true;
		
		for(int i=0;i<str.length()/2;i++){
			if(str.charAt(i)!= str.charAt(str.length()-i-1))
				flag = false;
				break;
		}
		if(flag==true)
			System.out.println("True");
		else
			System.out.println("False");
	
	}
	

	public static void main(String args[]){
		
		String str1 = "madam";
		String str2 = "hello";
		
		reverse(str1);
		System.out.println();
		reverse(str2);
	}

}