class Q5ReverseArray{
	
	static void reverse(int arr [] ){
		
		for(int i = arr.length-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
	
	}
	

	public static void main(String args []){
		
		int arr1 [] = {1,2,3,4};
		int arr2 [] = {7,8,9};
		
		reverse(arr1);
		System.out.println();
		reverse(arr2);
	}

}