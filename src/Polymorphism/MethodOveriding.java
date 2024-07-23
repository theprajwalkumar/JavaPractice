package Polymorphism;
//How many types of Constructor are there ?
//1. Default Constructor
//2. Non Parameterized Constructor
//3. Parameterized Constructor

public class MethodOveriding extends MethodOverloading{
	public MethodOveriding() {
		System.out.println("This is the non parameterized constructor ");
		
	}
	public MethodOveriding(int a) {
		System.out.println("This is the natural number" + a);
		
	}
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
		//mo.num(6, 7);
		
		System.out.println("**************************************");
		
		
		MethodOverloading mc=new MethodOverloading();
		mc.num();
		mc.num(2);
		mc.num(1, 2);
		mc.num(1, 2, 3);
		mc.num("Hello");
		

	}

}
