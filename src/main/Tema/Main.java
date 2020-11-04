package main.Tema;

public class Main {

	public static void main(String[] args) {

		Sirul2 fibonaci = new Sirul2();

		int index = 4;
		int first = 0;
		int second = 1;
		System.out.println("Primele " + index + " Numere din sirul Fibonacci sunt:" );
		System.out.println(first + "\n" + second);
		System.out.println(fibonaci.fido(index));
		
//		System.out.println(fibonaci.fido(10));

	}

}
