package in.cadac;

class Student {
	
	private String name;
	private int rollNo;
	private int marks;
	
	public Student() {}
	
	public Student(String name, int rollNo, int marks) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + "]";
	}
	
	
}

public class Assgn5Q4 {

	public static void main(String[] args) {
		Student st = new Student("Rohit",85,80);
		System.out.println(st.toString());
	}
}
