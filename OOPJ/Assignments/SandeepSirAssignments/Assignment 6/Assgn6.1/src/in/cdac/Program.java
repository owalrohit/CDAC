package in.cdac;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int []arr=new int[5];
		
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
		
		//accept record from user
		Scanner sc = new Scanner(System.in);
		System.out.println("entr ele of array:   ");
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
		sc.close();
	}
}
