
import java.util.*;

public class Q3Factorial{
	
	public static int factorial(int num){
		if(num<=1)
			return 1;
		
		return num*factorial(num-1);
	}
	
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter number for factorial :  ");
		int num = sc.nextInt();
		
		System.out.println(factorial(num));
	}
}