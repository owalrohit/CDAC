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
	public void findDuplicate() {
		Arrays.sort(arr);
		int temp [] = new int[arr.length];
		int j=0;
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j]=arr[i];
				j++;
				
			}
		}
		temp[j++]=arr[arr.length-1];
		for(int ele : temp) {
			System.out.print(ele+"  ");
		}
	}
	
}

public class Program {
	public static void main(String[] args) {
		Array a1 = new Array(  );
		
		a1.acceptRecord( );
		a1.printRecord( );
		a1.findDuplicate();
		
		Array.releaseResource();
	}
}
