import java.util.Arrays;

class Q7findRepeated{

	static void findRepeated(String str){
		
		char [] charArr = str.toCharArray();
		
		Arrays.sort(charArr);
		
		System.out.print("[");
		for(int i=0;i<charArr.length-1;i++){
			if(charArr[i] == charArr[i+1]){
				System.out.print("'"+charArr[i]+"'");
			}
		}
		System.out.print("]");
		System.out.println();
		

	}

	public static void main(String [] args){
		
		String str = "Hello";
		String str2 = "progrmming";
		
		findRepeated(str);
		findRepeated(str2);	
	}
}