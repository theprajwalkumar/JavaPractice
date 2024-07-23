package Constructor;

public class Dog {
	public Dog() {
		System.out.println("This is the non parameterized constructor");
	}
	public Dog(int a, int b) {
		System.out.println("This is the parameterized constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dd=new Dog();
		Dog bc=new Dog(1,2);

	}

}
