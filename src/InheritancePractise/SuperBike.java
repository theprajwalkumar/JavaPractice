package InheritancePractise;

public class SuperBike extends Bike{
	public void model() {
		System.out.println("The model of the bike is Kawasaki");
	}
	

	public static void main(String[] args) {
		
		SuperBike sb=new SuperBike();
		sb.brake();
		sb.tyre();
		sb.model();
		

	}

}
