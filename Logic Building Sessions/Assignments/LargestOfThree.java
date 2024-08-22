class LargestOfThree{
	public static void main(String args[]){

	int a=4;
	int b=3;
	int c=9;

	if(a>=b && a>=c){
		System.out.println(a+" is greater than both the numbers.");
		
	}
	if(b>=c && b>=a){
		System.out.println(b+" is greater than both the numbers.");

	}
	else{
		System.out.println(c+" is greater than both the numbers.");

	}

}
}