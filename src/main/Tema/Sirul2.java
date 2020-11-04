package main.Tema;

public class Sirul2 {

	// Sirul lui Fibonnaci

	public String fido(int f, int s, int fibIndex) {

		// Doua numere f = first (prima valoare)
		// s = second (a doua valoare)

		int t;
		String fibon = "";

		// Calculam suma lui f + s si o afisam

		for (int i = 0; i < fibIndex; i++) {

			t = f;
			f = s;
			s = t + f;
			fibon = s + " ";
			System.out.println(fibon);
		}

		return fibon;
	}

}
