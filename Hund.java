
public class Hund extends Tier {

	protected int anzahlZähne;
	protected String breed;

	public Hund(int height, int anzahlZähne, String breed) {
		super(height);
		this.anzahlZähne = anzahlZähne;
		this.breed = breed;
	}

	public int getAnzahlZähne() {
		return anzahlZähne;
	}

	public void setAnzahlZähne(int anzahlZähne) {
		this.anzahlZähne = anzahlZähne;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
}

