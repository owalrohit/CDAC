/*
Write a program to calculate the discount based on the total purchase amount. Use the following 
criteria: 
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount. 
 If the total purchase is less than Rs.500, apply a 5% discount.
*/

class DiscountCalculation{
	public static void main(String args[]){
		int purchase=400;
		
		if(purchase>=1000){
			System.out.println("20% discount is applied. ");
			float priceAfterDisc = purchase-((purchase/100)*20);
			System.out.println("price after 20% discount "+priceAfterDisc);
		}else if(500<=purchase && purchase<=999){
			System.out.println("10% discount is applied. ");
			float priceAfterDisc = purchase-((purchase/100)*10);
			System.out.println("price after 10% discount "+priceAfterDisc);
		}else{
			System.out.println("5% discount is applied. ");
			float priceAfterDisc = purchase-((purchase/100)*5);
			System.out.println("price after 5% discount "+priceAfterDisc);
		}
	
	
	}

}