

class Que14
{
	public static void main(String args[])
	{  
		for(int i=1; i<=10; i++)
		{
			if(i==5 || i==7 || i==9)
				 { 
					 continue;  
				 }
			 for(int j=1;j<i;j++)
			 {  
				System.out.print("*");
				 
			 }
			 System.out.println();
		}
	}
}