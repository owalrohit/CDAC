
import java.util.*;

public class ArmStrongQ1{

public static void checkArmStrong(int num){
	
	int num2 = num;
	int sum = 0;
	while(num2 != 0 ){
		int digit = num2 % 10 ;
		sum = sum + (int) Math.pow(digit,3) ;
		num2 /= 10 ;
	}
	
	if( num == sum )
			System.out.println(num+" is Armstrong number !!");
	else
			System.out.println(num+" is Armstrong not number !!");
}




public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number to check :  ");
	int num = sc.nextInt();
	
	checkArmStrong(num);
	
	
}

}