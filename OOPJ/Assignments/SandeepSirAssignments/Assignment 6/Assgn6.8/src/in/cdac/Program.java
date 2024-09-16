package in.cdac;

import java.util.Scanner;

public class Program {
	private static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
		System.out.println("Enter size of array :  ");
        int size = sc.nextInt();
        Arr1 arr = new Arr1(size);
        arr.setArrayValues();
        arr.printArray();;
	}
}
