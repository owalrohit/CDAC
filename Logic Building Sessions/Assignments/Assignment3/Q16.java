/*
16. Write a program to print the following pattern: 
	*
   ***
  *****
 *******
*********
*/


class Q16{
	public static void main(String args[]){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int s=1;s<=n-i;s++){
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++){
				System.out.print("*");
			}
			System.out.println();
  
		}
		
	}
}