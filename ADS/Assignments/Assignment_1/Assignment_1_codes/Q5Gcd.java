class Q5Gcd{

static int gcd(int a, int b){
	if(a%b==0)
		return b;
	
	while(b != 0){
		int temp = a;
		a=b;
		b= temp%b;
	}
	return a;
}


public static void main(String args[]){
	
	int num1 = 54;
	int num2 = 24;
	
	System.out.println(gcd(num1,num2));
	
}

}
