class Q6Reverse {
	
	static void reverse(String str){
		  //Breaking the sentence into words
		String s[] = str.split(" ");
			
		String rev = " ";
		
		for(int i=0;i<s.length;i++){		//tc=O(n) sc=O(n)
			rev = s[i]+" "+rev;
		}
		System.out.println(rev);
	}
	
	
  public static void main(String[] args) {
    
	String str1 =  "Hello World";
	String str2 = "Java Programming";
	
	reverse(str1);
	reverse(str2);
	
	
  }
}