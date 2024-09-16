package in.cdac;


import java.util.Arrays;
import java.util.Scanner;

class Array{
	 int[] arr=new int [5];
	
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
			System.out.println();
	}
	public static void releaseResource( ) {
		sc.close();
	}

	public void findMax() {
		Arrays.sort(arr);
		System.out.println("max ele :  "+arr[arr.length-1]);
		
	}

	public void findMin() {
	Arrays.sort(arr);
	System.out.println("min ele :  "+arr[0]);
	
		
	}
}
public class Program {
	public static void main(String[] args) {
		Array a1 = new Array(  );
		
		a1.acceptRecord( );
		a1.printRecord( );
		a1.findMax();
		a1.findMin();
		Array.releaseResource();
	}
}
