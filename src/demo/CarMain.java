package demo;

public class CarMain {

	public static void main(String[] args) {
		Car cc=new Car ();
		cc.setColor("Silver");
		cc.setModel("Skoda");
		cc.setTyre(5);
		cc.setSpeed("200km/hrs");
		
		System.out.println(cc.getColor());
		System.out.println(cc.getModel());
		System.out.println(cc.getSpeed());
		System.out.println(cc.getTyre());
		
		System.out.println(cc);

	}

}
