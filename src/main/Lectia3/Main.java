package main.Lectia3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Bunic bunic1 = new Bunic(66, "Nelutu");
		Bunic bunic2 = new Bunic(75, "Filofteius");

		Parinte parinte1 = new Parinte(42, "Vali", "Male");
		Parinte parinte2 = new Parinte(40, "Maria", "Female");
		Parinte parinte3 = new Parinte(30, "Teofil", "Male");
		Parinte parinte4 = new Parinte(35, "Afrodita", "Female");

		Copil copil1 = new Copil(15, "Max", "Male", 124);
		Copil copil2 = new Copil(6, "Larisa", "Female", 90);
		Copil copil3 = new Copil(10, "Gegiu", "Male", 250);
		Copil copil4 = new Copil(7, "Marcela", "Femaile", 15);

		List<Copil> copii = Arrays.asList(copil1, copil2, copil3, copil4);
		List<Parinte> parinti = Arrays.asList(parinte1, parinte2, parinte3, parinte4);
		List<Bunic> bunici = Arrays.asList(bunic1, bunic2);

//		System.out.println(celMaiBatran(bunici));
//		System.out.println(celMaiProstC(copii));
//		System.out.println(ceaMaiTanara(parinti));

		start(bunici, parinti, copii);
		
	}
	
	/* MENU */
	
	public static void start(List<Bunic> bunici, List<Parinte> parinti, List<Copil> copii) {
		System.out.println("Alegeti nr: ");
		System.out.println("1. cel mai batran bunic.");
		System.out.println("2. cel mai prost copil.");
		System.out.println("3. cea mai tanara mana.");
		System.out.println("0. Exit");
		
		int choice = scanner.nextInt();
		
		switch(choice) {
		case 1: {
			System.out.println(celMaiBatran(bunici));
			start(bunici, parinti, copii);
			break;
		}
		case 2: {
			System.out.println(celMaiProstC(copii));
			start(bunici, parinti, copii);
			break;
		}
		case 3: {
			System.out.println(ceaMaiTanara(parinti));
			start(bunici, parinti, copii);
			break;
		}
//		case 0:{
//			break;
//		}
		default: {
//			start(bunici, parinti, copii);
			break;
		}
		}
	}
	
	/* HELPERS */

	public static String celMaiBatran(List<Bunic> bunici) {

		int limit = 0;
		Bunic bun = new Bunic();

		for (Bunic el : bunici) {
			if (el.getVarsta() > limit) {
				limit = el.getVarsta();
				bun = el;

			}
		}
		return bun.getNume() + " este cel mai in varsta, la " + bun.getVarsta() + " ani!";
	}

	public static String celMaiProstC(List<Copil> copii) {

		int limit = 10000;
		Copil cop = new Copil();

		for (Copil el : copii) {
			if (el.getIq() < limit) {
				limit = el.getIq();
				cop = el;

			}
		}
		return cop.getNume() + " este cel mai prost copil! Iq:  " + cop.getIq();
	}

	public static String ceaMaiTanara(List<Parinte> parinti) {

		int limit = 100;
		Parinte par = new Parinte();

		for (Parinte el : parinti) {
			if (el.getVarsta() < limit && el.getSex() == "Female") {
				limit = el.getVarsta();
				par = el;

			}
		}
		return "Cea mai tarnara mama, " + par.getNume() + " are " + par.getVarsta() + " de ani!";
	}

}
