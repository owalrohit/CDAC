package in.cdac;

import java.util.Arrays;
import java.util.Scanner;

public class Arr1 {
	
		private int arr[];// Single-dimensional array as a field
		
		public Arr1( ) {
			this( 5 );
		}
		
		public Arr1(int size) {
			this.arr = new int[size];
		}

		public int[] getArr() {
			return arr;
		}

	    public void setArrayValues() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter " + arr.length + " integers:");
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        scanner.close();
	    }
	    
	    public void printArray() {
	        System.out.println("Array elements are:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();  
	    }



		@Override
		public String toString() {
			return "Arr [arr=" + Arrays.toString(arr) + "]";
		}
		

}
