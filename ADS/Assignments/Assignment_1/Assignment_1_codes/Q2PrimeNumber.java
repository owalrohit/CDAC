
import java.util.*;

public class Q2PrimeNUmber{
	
	public boolean checkPrime(int num){
		if(num<=1){
			System.out.println("not prime..");
		}
		for(int i=2;i<=num/2;i++){						//time complexity = O(n/2)==>O(n)
			if(num%i == 0 )
				return false;
		}
		return true;
	}
	
	
public static void main(String args [] ){
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter number to check :  ");
		int num = sc.nextInt();
		Q2PrimeNUmber q = new Q2PrimeNUmber();
		System.out.println(q.checkPrime(num));
	}
}