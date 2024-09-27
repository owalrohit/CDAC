public class Q4Fibonacci{
    static void printFibo(int n){		
		int num1=0,num2=1;		
		System.out.print("[");
		for(int i=0;i<n;i++){
			System.out.print(num1);
			if(i!=n-1){
				System.out.print(",");
			}
			int temp = num1+num2;
			num1 = num2;
			num2 = temp;
		}
		System.out.print("]");
	}
		/*static int printFiboRecursion(int n){
		if(n<=1)
			return n;
		
		return printFiboRecursion(n-1)+printFiboRecursion(n-2);
	}*/	
	public static void main(String [] args){
		int n = 5;
		
		printFibo(n);
		
		for(int i=0;i<n;i++){
		//System.out.print(printFiboRecursion(i));
		}
		
	}
}