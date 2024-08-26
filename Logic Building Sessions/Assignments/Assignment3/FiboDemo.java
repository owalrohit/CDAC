
//Write a program to print the Fibonacci sequence up to the number 21. 

class FiboDemo{
	public static void main(String args[]){
		int n1=0;
		int n2=1;
		int sum=0;
		for(int i=0;i<=15;i++){
			sum=n1+n2;
			System.out.print(" "+sum);
			if(sum==21){
				break;
			}
			n1=n2;
			n2=sum;
			
		}
	
	}
}