class Q2RemoveDuplicate{
	
	static int  lengthOfDeupliacte(int [] arr ){
		
		int count=0;
		for(int j=0;j<arr.length-1;j++){
			if(arr[j]!=arr[j+1]){
				count++;
			}
		}
		//return i+1;
		return count+1;
	}	
		
	
	
	public static void main(String args[]){
		
		int arr1 [] = {1, 1, 2};
		int arr2 [] = {0, 0, 1, 1, 2, 2, 3, 3};	
		
		System.out.println(lengthOfDeupliacte(arr1));
		
		System.out.println(lengthOfDeupliacte(arr2));
	}

}