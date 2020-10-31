package main.Lectia3;

public class Bunic {

	private int varsta;
	private String nume;
	
	public Bunic() {
		
	}
	public Bunic(int varsta, String nume ) {
		this.varsta = varsta;
		this.nume = nume;
	}
	

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

}
