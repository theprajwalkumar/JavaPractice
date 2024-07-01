package Abstraction;

public class FoodMain extends NorthIndian implements Chinese,Italian,SouthIndian{



	@Override
	public void Pasta() {
		System.out.println("Pasta is Italian Food");
		
	}

	@Override
	public void Macroni() {
		
		System.out.println("Macroni is Italian Food");
		
	}

	@Override
	public void Chowmein() {
		System.out.println("Chowmein is Chinese Food");
		
		
	}

	@Override
	public void Manchurian() {
		System.out.println("Manchurian is Chinese Food");
		
	}

	@Override
	public void Roti() {
		System.out.println("Roti is NorthIndian Food");
		
	}

	@Override
	public void Dal() {
		System.out.println("Dal is NorthIndian Food");
		
	}

	@Override
	public void Dosa() {
		System.out.println("Dosa is SouthIndian Food");
		
	}

	@Override
	public void Sambar() {
		System.out.println("Sambar is SouthIndian Food");
		
	}
	public static void main(String[] args) {
		FoodMain fm=new FoodMain();
		fm.Roti();
		fm.Dal();
		fm.Dosa();
		fm.Sambar();
		fm.Chowmein();
		fm.Manchurian();
		fm.Pasta();
		fm.Macroni();

	}

}
