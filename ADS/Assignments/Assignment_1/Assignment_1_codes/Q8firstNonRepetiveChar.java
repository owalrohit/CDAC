import java.util.*;

public class Q8firstNonRepetiveChar{
		
	static void findChar(String str ){
		
		boolean flag = true;
		
		for(char i: str.toCharArray()){
			if(str.indexOf(i) == str.lastIndexOf(i)){
				System.out.println("first non-repeated char is :  "+i);
				flag = false;
				break;
			}
		}
		if(flag==true){
			System.out.println("null");
		}
	}

public static void main(String [] args){
	
	String str1 = "stress";
	String str2 = "aabbcc";
	
	findChar(str1);
	findChar(str2);
	
}

}