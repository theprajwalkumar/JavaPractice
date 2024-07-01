package InheritancePractise;

public class SuperCar extends Car{
	public void seat() {
		System.out.println("Car has 5 seats");
	}
	public void model() {
		System.out.println("Car is of skoda");
	}

	public static void main(String[] args) {
		Car cc=new Car();
		cc.speed();
		
		SuperCar dd=new SuperCar();
		dd.seat();
		dd.model();
		dd.speed();
		dd.light();

	}

}
