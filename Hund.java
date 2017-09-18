
public class Hund extends Tier {

	protected int anzahlZähne;

	public Hund(int height, int anzahlZähne) {
		super(height);
		this.anzahlZähne = anzahlZähne;
	}

	public int getanzahlZähne() {
		return anzahlZähne;
	}

	public void setanzahlZähne(int anzahlZähne) {
		this.anzahlZähne = anzahlZähne;
	}
	
}
