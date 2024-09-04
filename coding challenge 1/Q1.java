package codingchallenge;

public class Q1 {
	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n-1;j++) {
				System.out.print(" ");
			}if(i==1 || i==n) {
				for(int j=1;j<=i*2-1;j++) {
					System.out.print("*");				
					}
			}else {
				System.out.print("*");
				for(int j=1;j<=2*i-3;j++){
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println(" ");
			
		}
		
		
		
	}
}
