class Q1Pattern{

	static void pattern(int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){				//time complexity = O(n^2)
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	public static void main(String args[]){
	
		int n1 = 5; 
		int n2 = 3;
	
		System.out.println("When n = "+n1);
		pattern(n1);
		
		System.out.println();
		System.out.println();
		
		System.out.println("When n = "+n2);
		pattern(n2);
	}


}