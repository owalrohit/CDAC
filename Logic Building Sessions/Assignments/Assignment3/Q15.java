
/*
15. Write a program to print the following pattern: 
		*
       * *
	  * * *
	 * * * *
	* * * * *
//stars without space 
*/




public class Q15{    
	public static void main(String args[]){  
		int n=5;
		for(int i=1;i<=n;i++){
			for(int s=1;s<=n-i;s++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}   
} 