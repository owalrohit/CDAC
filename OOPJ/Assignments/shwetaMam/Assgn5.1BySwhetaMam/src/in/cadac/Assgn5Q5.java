package in.cadac;


class Vehicle1{
	
	public void startEngine() {
		System.out.println("inside vehicle start");
	}
	public void stopEngine() {
		System.out.println("inside vehicle stop");
		
	}
}

class Car1 extends Vehicle1{
	@Override
	public void startEngine() {
		System.out.println("inside car start");
	}
	@Override
	public void stopEngine() {
		System.out.println("inside car stop");

	}
}
class MotorCycle extends Vehicle1{
	@Override
	public void startEngine() {
		System.out.println("inside motorcycle start");
	}
	@Override
	public void stopEngine() {
		System.out.println("inside motorcycle stop");
}
}

public class Assgn5Q5 {

	public static void main(String[] args) {
		MotorCycle mc = new MotorCycle();
		mc.startEngine();
		mc.stopEngine();
		
		Car1 cr = new Car1();
		cr.startEngine();
		cr.stopEngine();
		
		Vehicle1 vl = new Vehicle1();
		vl.startEngine();
		vl.stopEngine();
	}
	
}
