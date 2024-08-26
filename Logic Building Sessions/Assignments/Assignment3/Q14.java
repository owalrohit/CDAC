
/*
14. Write a program to print the following pattern: 
 * 
 ** 
 *** 
 ***** 
 ******* 
 *********
 */
 
 class Q14{
	 public static void main(String args[]){
		 
		 for(int i=1;i<10;i++){
			 if(i==4 ||i==6||i==8)
				 continue;
			 for(int j=1;j<=i;j++){
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	 }
	 
	 
 }