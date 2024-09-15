package in.cadac;

class Animal{
	String name="Animal";
	
	public void eat() {
		System.out.println("animal eat");
	}
	public void sleep() {
		System.out.println("animal sleep");
	}
}
class Dog extends Animal{
	String name="Dog";
	
	public void bark() {
		System.out.println("Dog bark");
	}
}


public class Assgn5Q3 {

	public static void main(String[] args) {
		Animal an = new Animal();
		System.out.println(an.name);
		an.eat();
		an.sleep();
		
		System.out.println("----------------------------");
		
		Dog dog =new Dog();
		System.out.println(dog.name);
		dog.bark();
		dog.eat();
		dog.sleep();
		
	}
}
