package main.Tema;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Sirul2 fibonaci = new Sirul2();

		int index;
		int first;
		int second;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti primele doua valori ale sirului: \n");
		first = sc.nextInt();
		System.out.println("\n");
		second = sc.nextInt();
		System.out.println("\n");
		System.out.println("Introduceti numarul valorilor afisate: \n");
		index = sc.nextInt();
		System.out.println("\n");
		sc.close();

		System.out.println("Primele " + (index + 2) + " numere din sirul Fibonacci sunt: \n");
		System.out.println(first + "\n" + second);
		System.out.println(fibonaci.fido(first, second, index));

//		System.out.println(fibonaci.fido(10));

	}

}

