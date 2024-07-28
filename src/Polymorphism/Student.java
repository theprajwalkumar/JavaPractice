package Polymorphism;

public class Student {
	public void dance() {
		System.out.println("Student can dance");
	}
	public void dance(int a) {
		System.out.println("There are students for dance"+a);
	}
	public void dance(int a, int b) {
		int sum=a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Student Ram=new Student();
		Ram.dance();
		Ram.dance(3);
		Ram.dance(3,4);
		System.out.println("Here this is the example for Method Overloading");

	}

}
