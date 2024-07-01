package Polymorphism;

public class MethodOveriding extends MethodOverloading{
	public void num() {
		System.out.println("This is the method overiding");
	}
	public void num(int a) {
		System.out.println("This is the new number "+ a);
	}
	public void num (int b, int c) {
		System.out.println("This is the newest number ");
	}

	public static void main(String[] args) {
		MethodOveriding mo=new MethodOveriding();
		mo.num();
		mo.num(7);
		mo.num(6, 7);
		
		
		MethodOverloading mc=new MethodOverloading();
		mc.num();
		mc.num(2);
		mc.num(1, 2);
		mc.num(1, 2, 3);
		mc.num("Hello");
		

	}

}
