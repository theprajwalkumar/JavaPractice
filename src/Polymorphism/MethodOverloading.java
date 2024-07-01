package Polymorphism;

public class MethodOverloading {
	public void num() {
		System.out.println("This is the number");
	}
	public void num(int a) {
		double area=3.14*a*a;
		System.out.println(area);
	}
	public void num(int b , int c) {
		int sum=b+c;
		System.out.println(sum);
		
	}
	public void num(int d, int e, int f) {
		int sum=d+e+f;
		System.out.println(sum);
	}
	public void num(String name) {
		System.out.println("Please print the numbers " + name);
	}

	public static void main(String[] args) {
		MethodOverloading ml=new MethodOverloading();
		ml.num();
		ml.num(8);
		ml.num("Prajwal");
		ml.num(5, 5);
		ml.num(5, 5, 5);

	}

}
