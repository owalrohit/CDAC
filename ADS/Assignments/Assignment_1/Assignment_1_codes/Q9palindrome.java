import java.util.*;
public class Q9palindrome{
	public static boolean isPalindrome(int num){
		if(num<0)
			return false;
		
		int og = num;
		int rev = 0;
		while(num!=0){
			int digit = num%10;
			rev = digit+rev*10;
			num = num/10;
		}
		if(rev==og)
			return true;
		else
			return false;
	}

public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter number to check :  ");
		int num = sc.nextInt();
	
		System.out.println(isPalindrome(num));
}

}