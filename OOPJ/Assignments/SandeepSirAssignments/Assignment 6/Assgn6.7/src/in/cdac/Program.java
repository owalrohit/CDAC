package in.cdac;

import java.util.Scanner;

class Arr{
	private int arr[];
	
	public Arr( ) {
		this( 5 );
	}
	
	public Arr(int size) {
		this.arr = new int[size];
	}

	
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

	
}


public class Program {
	public static void main(String[] args) {
		Arr ar = new Arr();
		ar.acceptRecord();
		ar.printRecord();
		Arr.releaseResource();
	}
}
