class Recursion_1{
	
	static int i=0;
	static void show(){ //recursion method
		++i;
		if(i<=5){//termination condition or base condition
		System.out.println("Hello "+i+" Recrsion !!!");
		show();//recursive call
	}
	}
	
	
	public static void main(String args[]){
		show();//calling method
	}
}