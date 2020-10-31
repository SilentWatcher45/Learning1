package main.Lectia1;

public class Main {

	public static void main(String[] args) {
		Numar nr = new Numar();

		System.out.println(nr.media(10.0, 13.0));
//		System.out.println("Factorialul este " + nr.fact(6));
//		System.out.println("Suma este " + nr.sum(10));

		Algoritm alg = new Algoritm();
		int[] ector = { 14, 21, 0, 56, 12, 1000, 4 };
		int[] vali = { 5, 4, 3, 2, 1 };
		int[] gigi = { 1, 11, 120, 1459 };

//		System.out.println(alg.show(alg.sort(ector)));
//		System.out.println(alg.show(alg.sort(vali)));

//		System.out.println("Suma lui ector este: " + alg.sum(ector));
//		System.out.println("Suma lui vali este: " + alg.sum(vali));

//		check(ector, "Ector");
//		check(vali, "Vali");
//		check(gigi, "Gigi");

//		System.out.println(alg.checkNumber(5, vali));
//		System.out.println(alg.checkNumber(12, gigi));
//		System.out.println(alg.checkNumber(21, ector));
		System.out.println(alg.getThatBoss(ector));
		System.out.println(alg.getThatBoss(vali));
		System.out.println(alg.getThatBoss(gigi));
	}
	
	

	private static void check(int[] vector, String name) {
		Algoritm alg = new Algoritm();
		if (alg.izCresc(vector)) {
			System.out.println(name + " este crescator!");
		} else if (alg.izDesc(vector)) {
			System.out.println(name + " este descrescator!");
		} else {
			System.out.println(name + " este alandala!");
		}
	}

}
