//Write a program to find and print the largest digit in the number 4825.

class LargestDigitInNumber{
	public static void main(String args[]){
		int number = 4825;
		int largest = 0;
		
		while(number>0){
			int remainder = number%10;
			if(remainder>largest){
				largest=remainder;
			}
			number=number/10;
		}
		System.out.println(largest);
	
	}

}