class Q10LeapYear{

static boolean isLeap(int year){
	
	if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 )
		return true;
	return false;
}

public static void main(String args [] ){
	
	int year1 =  2020;
	int year2 = 1900;
	
	System.out.println(year1 + "  "+isLeap(year1));
	
	System.out.println(year2 + "  "+isLeap(year2));
	
	}

}