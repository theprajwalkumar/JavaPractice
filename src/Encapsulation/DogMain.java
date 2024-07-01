package Encapsulation;

public class DogMain {

	public static void main(String[] args) {
		Dog dd=new Dog();
		dd.setBreed("Saint Bernard");
		dd.setColor("Brown-White");
		dd.setLegs(4);
		dd.setTail(1);
		
		System.out.println(dd);
		System.out.println(dd.getBreed());
		System.out.println(dd.getColor());
		System.out.println(dd.getLegs());
		System.out.println(dd.getTail());

	}

}
