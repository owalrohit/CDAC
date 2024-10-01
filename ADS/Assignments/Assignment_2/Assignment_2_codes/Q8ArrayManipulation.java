class Q8ArrayManipulation{

	static long manipulation(int n, int [] [] queries1){
		
		long res [] = new long[n+2];					//space complexity = O(n);
		for(int i=0;i<queries1.length;i++){			//time complexity = O(n);
			int a = queries1[i][0];
			int b = queries1[i][1];
			int k = queries1[i][2];
			
			res[a] = res[a]+k;
			res[b+1] = res[b+1]-k;
			
		}
		long max = 0;
		for(int i=1;i<=n;i++){
			res[i]=res[i]+res[i-1];
			max = Math.max(res[i],max);
		}
		return max;
	}
	
	public static void main(String args[]){
		
		int n1 = 5;		//size of array
		int[][] queries1 = {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}};
		
		int n2 = 4;
		int[][] queries2 = {{1, 3, 50}, {2, 4, 70}};
		
		System.out.println("output for case 1 :  "+manipulation(n1,queries1));
		System.out.println("output for case 2 :  "+manipulation(n2,queries2));
		
	}

	
}