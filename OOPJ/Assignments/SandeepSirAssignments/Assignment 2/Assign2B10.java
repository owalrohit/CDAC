
public class Assign2B10 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt( args[ 0 ] );
        int num2 = Integer.parseInt(args[ 2 ] );
        String ch = args[1];
        
  
        switch (ch) {
		case "+":
			int result = num1 + num2;
			System.out.println("sum :  "+result);
			break;
		case "-":
			int result1 = num1 - num2;
			System.out.println("subtraction :  "+result1);
			break;
		case "*":
			int result2 = num1 * num2;
			System.out.println("multiplication :  "+result2);
			break;
		case "/":
			int result3 = num1 / num2;
			System.out.println("division :  "+result3);
			break;

		default:
			break;
		}
	}
}
