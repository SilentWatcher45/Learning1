package main.Tema3;

public class Matrix {

	// Pentru Matrici patratice!!!!!
	public void matrice(int mat[][]) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j] + "\t");
			}

			System.out.println();
		}
	}

	public void matrice(String mat[][]) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j] + "\t");
			}

			System.out.println();
		}
	}

	public void det(int matr[][]) {
		int principala = 1;
		int secundara = 1;

		for (int i = 0; i < matr.length; i++) {
			principala *= matr[i][i];
		}
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr.length; j++) {
				if (i + j == matr.length - 1) {
					secundara *= matr[i][j];
				}
			}
		}
		System.out.println((principala - secundara));
	}
}