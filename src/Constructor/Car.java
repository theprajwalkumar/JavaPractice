package Constructor;

public class Car {
	public Car() {
		System.out.println("This is the non parameterized constructor");
	}
	public Car(int r) {
		double area=3.14*r*r;
		System.out.println(area);
	}
	public Car(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		Car cc=new Car();
		Car dc=new Car(2);
		Car fc=new Car(1,2);
		
		// TODO Auto-generated method stub

	}

}
