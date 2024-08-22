/*Write a program to classify student grades based on the following criteria: 
? If the score is greater than or equal to 90, print "A" 
? If the score is between 80 and 89, print "B" 
? If the score is between 70 and 79, print "C" 
? If the score is between 60 and 69, print "D" 
? If the score is less than 60, print "F" */


import java.util.Scanner;
class GradeClassification{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//int score=56;
		System.out.println("Enter marks to check : ");
			int score = sc.nextInt();
		if(score>=90){
			System.out.println("grade A ");
		}else if(score>=80 && score<=89){
			System.out.println("grade B ");
		}else if(score>=70 && score<=79){
			System.out.println("grade c ");
		}else if(score>=60 && score<=69){
			System.out.println("grade D ");
		}else{
			System.out.println("grade F ");
		}
		
	}
}