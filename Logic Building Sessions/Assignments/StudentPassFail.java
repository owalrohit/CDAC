/*
Write a program that determines whether a student passes or fails based on their grades in three 
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or 
more subjects, print the number of subjects they failed in. 
*/

class StudentPassFail{
	public static void main(String args[]){
		int sub1 = 45;
		int sub2 = 22;
		int sub3 = 44;
		int count =0;
		
		if(sub1<40){
			count++;
		}else if(sub2<40){
			count++;
		}else if(sub3<40){
			count++;
		}else{
			System.out.println("Student is passed in all 3 subjects.");
		}
		
		switch(count){
			case 1:System.out.println("Student failed in 1 subject.");
			break;
			case 2:System.out.println("Student failed in 2 subjects.");
			break;
			case 3:System.out.println("Student failed in 3 subjects.");
			break;
		}
		
		
		
		
	}
}