package main.Lectia2;

public class Main {

	public static void main(String[] args) {
		Brand opel = new Brand("opel", 2000); 
		Brand audi = new Brand("audi", 1500);
		Car masina1 = new Car("Verde", opel, 2015);
		Car masina2 = new Car("Gri", audi, 2002);
		Car masina3 = new Car("Rosu", opel, 2003);
		Service service = new Service();
		
		service.paint(masina2, "alba");
		
		System.out.println(service.showCars());
		System.out.println("================");
		
		service.paint(masina1, "Albastra");
		
		System.out.println(service.showCars());
		System.out.println("================");
		
		service.changeYear(masina2, 2010);
		
		System.out.println(service.showCars());
		System.out.println("================");
		
		service.changeYear(masina3, 2010);
		
		System.out.println(service.showCars());
		System.out.println("================");
		
	}

}
