package demo;

public class Car {


		private int tyre;
		public int getTyre() {
			return tyre;
		}
		public void setTyre(int tyre) {
			this.tyre = tyre;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getSpeed() {
			return speed;
		}
		@Override
		public String toString() {
			return "Car [tyre=" + tyre + ", color=" + color + ", model=" + model + ", speed=" + speed + ", getTyre()="
					+ getTyre() + ", getColor()=" + getColor() + ", getModel()=" + getModel() + ", getSpeed()="
					+ getSpeed() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
		public void setSpeed(String speed) {
			this.speed = speed;
		}
		private String color;
		private String model;
		private String speed;
		
		
		
		

	

}
