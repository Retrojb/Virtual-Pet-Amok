
public class DogCages {

	private int poopLvl;
	
	public DogCages (int poopLvl) {
		this.poopLvl = poopLvl;
	}
	
	public int cleanDogCage() {
		poopLvl = 0;
		return poopLvl;
	}
	
	public int getPoopLvl() {
		return poopLvl;
	}
	
	public void wettingTheCage() {
		int fecalMatter = 5;
		poopLvl += fecalMatter;
	}
	@Override
	public String toString() {
		return "Dog cage waste level: " + poopLvl;
	}
	
}
