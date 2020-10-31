package main.Lectia3;

public class Copil extends Parinte {
	
	private int iq;
	
	public Copil() {
		super();
	}
	
	public Copil(int varsta, String nume) {
		super(varsta, nume);
	}

	public Copil(int varsta, String nume, String sex) {
		super(varsta, nume, sex);
		
	}
	
	public Copil(int varsta, String nume, String sex, int iq) {
		super(varsta, nume, sex);
		this.iq = iq; 
	}
	
	public int getIq() {
		return iq;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}
	

}
