class Q4ReverseString{

	static void reverse(String str){
		
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}
	}
	

	public static void main(String args[]){
		
		String str1 = "hello";
		String str2 = "Java";
		
		reverse(str1);
		System.out.println();
		reverse(str2);
	}

}