package main.Tema;

public class Sirul {

	
	/* Sirul lui Fibonnaci */
	
	public String fibo(int[] fib, int fibIndex) {
		
		/* Vom afisa totul intr-o variabila String */

		String fibonnaci = " ";

		/* Parcurgem vectorul initial de la a treia pozitie pana la 
		 * la pozitia indexului care ne arata la a cata pozitie a 
		 * sirului se opreste. 
		 */
		
		for (int i = 2; i < fibIndex; i++) {

			fib[i] = fib[i - 2] + fib[i - 1];

		}

		/* Stringul primeste valorie sirului  */
		
		for (int i = 0; i < fibIndex; i++) {
			fibonnaci = "Primele " + fibIndex + " numere din Siirul lui Fibonnaci sunt: \n" + fib[i] + " ";
		}

		return fibonnaci;

	}

}
