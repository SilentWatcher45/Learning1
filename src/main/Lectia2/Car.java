package main.Lectia2;

public class Car {

	private String colour;
	private Brand brand;
	private int year;

	public Car() {

	}

	public Car(String _colour, Brand _brand, int _year) {
		this.colour = _colour;
		this.brand = _brand;
		this.year = _year;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
