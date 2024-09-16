package in.cdac;


import java.util.Scanner;

class Array{
	private int[] arr=new int [5];
	
	private static Scanner sc = new Scanner(System.in);
	
	public void acceptRecord() {
		for( int i = 0; i < this.arr.length; i++ ) {
			System.out.print("Enter arr["+ i +"]	:	");
			this.arr[i] = sc.nextInt();
		}
	}

	public void printRecord() {
		for( int i = 0; i < this.arr.length; i++ )
			System.out.print( this.arr[i]+"  ");
	}
	public static void releaseResource( ) {
		sc.close();
	}
}
public class Program {
	public static void main(String[] args) {
		Array a1 = new Array(  );
		
		a1.acceptRecord( );
		
		a1.printRecord( );
		
		Array.releaseResource();
	}
}
