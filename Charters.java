package SuperChar;

public class Charters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpiderMan S1 = new SpiderMan();
		S1.setSpecialPower("Fyling");
		S1.userOfSuperPower();
		S1.setColorShoes("Red");
		System.out.println(S1.getColorShoes());
		
	}
	

}



class SuperPowerChar{
	
	private String SpecialPower;

	public String getSpecialPower() {
		return SpecialPower;
	}

	public void setSpecialPower(String specialPower) {
		SpecialPower = specialPower;
	}
	
	public void userOfSuperPower() {
		
	}
	
}

class SpiderMan extends SuperPowerChar{
	
	private String ColorShoes;
	
	public String getColorShoes() {
		return ColorShoes;
	}

	public void setColorShoes(String colorShoes) {
		ColorShoes = colorShoes;
	}


	public void userOfSuperPower() {
		System.out.println("Super Power of SpiderMan " + this.getSpecialPower());
	}
	
}