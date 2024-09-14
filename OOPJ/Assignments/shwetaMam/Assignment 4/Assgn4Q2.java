package in.cdac;
//2) Create a program that demonstrates narrowing conversion from double to int and prints the result.

public class Assgn4Q2 {

	public static void main(String[] args) {
		double dl = 100.08d;
		int in = (int ) dl;
		
		System.out.println("double value :  "+dl);
		System.out.println("int value :  "+in);

	}
}

/*
output - 
double value :  100.08
int value :  100
*/