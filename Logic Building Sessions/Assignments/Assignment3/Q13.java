
/*
13. Write a program to print the following pattern: 
1 
2*2 
3*3*3 
4*4*4*4 
5*5*5*5*5 
5*5*5*5*5 
4*4*4*4 
3*3*3 
2*2 
1
*/

public class Q13 {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for(int i= 1; i<=n*2; i++) {
            for(int j=1; j<=num;j++) {
                System.out.print(num);
                if(j<num) {
                    System.out.print("*");
                }
            }
            if(i < n){
                num++;
            }else if(i > n){
                num--;
            }
			System.out.println();
            
        }
    }
}