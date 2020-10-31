package main.Lectia3;

public class Parinte extends Bunic {

	private String sex;
	
	public Parinte() {
		super();
	}
	
	public Parinte(int varsta, String nume ) {
		super(varsta, nume);
		this.sex = "Male";
		
	}
	public Parinte(int varsta, String nume, String sex ) {
		super(varsta, nume);
		this.sex = sex;
		
	}
	

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}	
	
}
	
