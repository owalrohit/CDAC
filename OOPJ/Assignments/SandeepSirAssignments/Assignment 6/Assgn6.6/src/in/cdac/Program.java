package in.cdac;

import java.util.Arrays;

public class Program {
	public static void main(String[] args) {
		
		int arr[]= {1,2,4,5};
		
		int sum1 = 0;
		for(int i=0;i<arr.length;i++) {
			sum1=sum1+arr[i];
		}
		Arrays.sort(arr);
		int sum2=0;
		for(int i=1;i<=5;i++) {
			sum2=sum2+i;
		}
		int missingEle=sum2-sum1;
		System.out.println("missing element is :"+missingEle);
	}
}
