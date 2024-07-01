package Encapsulation;

public class Dog {
	private int tail;
	private String color;
	private String breed;
	private int Legs;
	public int getTail() {
		return tail;
	}
	public void setTail(int tail) {
		this.tail = tail;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getLegs() {
		return Legs;
	}
	public void setLegs(int legs) {
		Legs = legs;
	}
	@Override
	public String toString() {
		return "Dog [tail=" + tail + ", color=" + color + ", breed=" + breed + ", Legs=" + Legs + "]";
	}
	

}
