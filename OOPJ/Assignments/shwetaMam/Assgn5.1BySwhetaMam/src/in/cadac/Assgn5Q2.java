package in.cadac;

class Vehicle{
	private String make;
	private int year;
	
	public Vehicle(){
		this.make="maurti";
		this.year=2024;
	}
	public Vehicle(String make, int year) {
		this.make=make;
		this.year=year;
		
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

}
class Car extends Vehicle{
	private String model;
	
	public Car() {
		this.model="maruti 800";
	}
	public Car(String model,String make,int year) {
		super(make,year);
		this.model=model;
	}
	
	public void display() {
	System.out.println(this.model+" "+this.getMake()+" "+this.getYear());
	}
}



public class Assgn5Q2 {

	public static void main(String[] args) {
		Car car = new Car("altroz", "tata", 2022);
		car.display();
	}
}
