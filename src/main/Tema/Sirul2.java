package main.Tema;

public class Sirul2 {

	// Sirul lui Fibonnaci

	public String fido(int f, int s, int fibIndex) {

		// Doua numere f = first (prima valoare)
		// s = second (a doua valoare)
		double medAr = 0;
		int t;
		int sum = f + s;
		String fibon = "";

		// Calculam suma lui f + s si o afisam

		for (int i = 0; i < fibIndex; i++) {

			t = f;
			f = s;
			s = t + f;
			sum = sum + s;
			fibon = s + "";
			System.out.println(fibon);

		}

		medAr = sum / (fibIndex + 2);
		System.out.println("\nSuma elementelor sirului este: \n");
		System.out.println(sum);
		System.out.println("\nMedia aritmetica a elementelor sirului este: \n");
		System.out.println(medAr);

		return fibon;
	}

}
