package main.Lectia2;

public class Brand {
	private String nume;
	private int masini;

	public Brand(String _nume, int _masini) {
		this.nume = _nume;
		this.masini = _masini;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getMasini() {
		return masini;
	}

	public void setMasini(int masini) {
		this.masini = masini;
	}

}
