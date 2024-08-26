//Write a program to calculate the sum of the digits of the number 9876. The output should be 
//30 (9 + 8 + 7 + 6). 

class SumOfDigit{
	public static void main(String args[]){
		int number = 9876;
		int sum=0;
		while(number!=0){
			int remainder=number % 10;
			sum = sum+remainder;
				number=number/10;
		//	System.out.print(sum+"("+remainder+" + ");	
		}
		
		//System.out.println();
		System.out.println(sum);
		
	}
	
}