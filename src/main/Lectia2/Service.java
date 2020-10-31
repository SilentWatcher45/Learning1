package main.Lectia2;

import java.util.ArrayList;
import java.util.List;

public class Service {
	private List<Car> allCars = new ArrayList<>();

	public Car paint(Car masina, String newColour) {
		allCars.add(masina);
		masina.setColour(newColour);
		return masina;
	}

	public Car changeYear(Car masina, int newYear) {
		allCars.add(masina);
		masina.setYear(newYear);
		return masina;
	}

	public String showCars() {
		StringBuilder sb = new StringBuilder();

		for (Car car : allCars) {
			// @formatter:off
			sb.append(car.getBrand().getNume())
				.append(" ")
				.append(car.getColour())
				.append(" ")
				.append(car.getYear())
				.append("\n");
			// @formatter:on
		}

		return sb.toString();
	}

	public List<Car> getAllCars() {
		return allCars;
	}

	public void setAllCars(List<Car> allCars) {
		this.allCars = allCars;
	}

}
