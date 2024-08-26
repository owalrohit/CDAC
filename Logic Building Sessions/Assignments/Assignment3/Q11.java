//11.	Write a Java program to demonstrate the use of both pre-increment and post-decrement operators in a single expression


class Q11{
	public static void main(String args[]){
		int x=10;
		int y=20;
		
		int sum = ++x + y--;

		System.out.println("value of x: "+x);//here x=11 bcoz of pre-increment
		System.out.println("value of y: "+y);//here y=19 bcoz of post-decrement
		
		System.out.println("value of sum: "+sum);//here sum=31
												//==>x=11 & y=20
												//==>11+20=31
	}
}