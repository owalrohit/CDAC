package in.cdac;

class InstanceCounter {
	private static int counter=0;
	
	public InstanceCounter(){
		counter++;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		InstanceCounter.counter = counter;
	}

	@Override
	public String toString() {
		return "InstanceCounter [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}


public class Project {
	public static void main(String[] args) {
		InstanceCounter ic = new InstanceCounter();
		InstanceCounter ic1 = new InstanceCounter();
		InstanceCounter ic2 = new InstanceCounter();
		InstanceCounter ic3 = new InstanceCounter();
		
		System.out.println(InstanceCounter.getCounter());
	}
}
