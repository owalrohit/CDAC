/*

22. Write a program to print the following pattern: 
********* 
 ******* 
  ***** 
   *** 
    * 
   *** 
  ***** 
 ******* 
********* 

*/

class Q22{
	public static void main(String args[]){
		int n=5;
		for(int i=5;i>=1;i--){
			for(int s=5;s>=i;s--){
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(int i=2;i<=5;i++){
			for(int s=5;s>=i;s--){
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}