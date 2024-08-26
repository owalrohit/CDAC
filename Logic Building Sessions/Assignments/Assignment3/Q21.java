/*
21. Write a program to print the following pattern: 
1 
1*3 
1*3*5 
1*3*5*7 
1*3*5*7*9
*/

class Q21{
	public static void main(String args[]){
		int n=5;
		int num=1;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i*2;j++){
			if(j%2==0){
					continue;
			}else if(j==1){
				System.out.print(j);
			}else	
				System.out.print("*"+j);
			}
			System.out.println();
		}
	}
}