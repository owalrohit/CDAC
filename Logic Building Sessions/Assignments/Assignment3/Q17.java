/*
17. Write a program to print the following pattern: 
* * * * * 
 * * * * 
  * * * 
   * * 
   * 
*/

class Q17{
	public static void main(String args[]){
		int n=5;
		for(int i=0;i<n;i++){
			for(int s=0;s<i;s++){
				System.out.print(" ");
			}
			for(int j=i;j<n;j++){
				System.out.print("* ");
			}
			
			System.out.println(" ");
		}
		
	}
}

