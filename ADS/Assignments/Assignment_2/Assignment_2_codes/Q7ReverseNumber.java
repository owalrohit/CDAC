import java.util.*;

class Q7ReverseNumber{

	static Stack<Integer> st = new Stack<>();
	
	static void pushDigit(int num){
		while(num!=0){
			st.push(num%10);
			num = num/10;
		}
	}
	static int  reverse(int num){
			pushDigit(num);
			int reverse = 0;
			int i=1;
			
		while (!st.isEmpty())
        {
            reverse = reverse + (st.peek() * i);
            st.pop();
            i = i * 10;
        }
        return reverse;
	}


	public static void main(String args []){
		
		int num1 = 12345;
		int num2 = -9876;
		
		System.out.println(reverse(num1));
		System.out.println();
		System.out.println(reverse(num2));

	}
	

}