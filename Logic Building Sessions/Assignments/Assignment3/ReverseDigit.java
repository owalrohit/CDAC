//Write a program to reverse the digits of the number 1234. The output should be 4321.

class ReverseDigit{
	public static void main(String args[]){
		int digit =1234;
		int rev = 0;
		
		while(digit!=0){
			int remainder = digit%10;
			rev = rev*10+remainder;
			digit = digit/10;
		}
		
		System.out.println("Reverse number is : "+rev);
	}
}