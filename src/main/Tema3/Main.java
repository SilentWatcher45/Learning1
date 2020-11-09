package main.Tema3;

public class Main {

	public static void main(String[] args) {
		Matrix val = new Matrix();

		int[][] matr = { { 1, 2 }, { 3, 4 } };
		int[][] matr2 = { { 9, 13, 5, 2 }, { 1, 11, 7, 6 }, { 3, 7, 4, 1 }, { 6, 0, 7, 10 } };
//		String [][] matr3 = {{"00", "01", "02"}, {"10", "11", "12"}, {"20", "21", "22"}};

		System.out.println("Matricea este tot o matrice, daca stam sa ne gandeim! Nu? ");
		System.out.println("---------------------------------------------------------");
		val.matrice(matr);
		System.out.println("---------------------------------------------------------");
		System.out.println("Ce avem noi aici? Sa fie oare determinantul matricei de mai sus? ");
		System.out.println("---------------------------------------------------------");
		val.det(matr);
		System.out.println("---------------------------------------------------------");
		System.out.println("Da!!! Chiar el este!");
		System.out.println();
		System.out.println("=========================================================");
		System.out.println();
		System.out.println("Matricea este tot o matrice, daca stam sa ne gandeim! Nu? ");
		System.out.println("---------------------------------------------------------");
		val.matrice(matr2);
		System.out.println("---------------------------------------------------------");
		System.out.println("Ce avem noi aici? Sa fie oare determinantul matricei de mai sus? ");
		System.out.println("---------------------------------------------------------");
		val.det(matr2);
		System.out.println("---------------------------------------------------------");
		System.out.println("Da!!! Chiar el este!");
//		val.matrice(matr);
//		System.out.println("---------------------------------------------------------");
//		System.out.println("---------------------------------------------------------");
//		val.matrice(matr2);

	}
}
