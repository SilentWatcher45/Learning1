package main.Tema;

public class Sirul2 {

	// Sirul lui Fibonnaci

	public String fido(int fibIndex) {

		// Doua numere f = first (prima valoare)
		// s = second (a doua valoare)

		int f = 0;
		int s = 1;
		int t;
		String fibon = "";

		// Calculam suma lui f + s si o afisam

		for (int i = 2; i < fibIndex; i++) {

			t = f;
			f = s;
			s = t + f;
			fibon = s + "";
			System.out.println(fibon);
		}

		return fibon;
	}

}
