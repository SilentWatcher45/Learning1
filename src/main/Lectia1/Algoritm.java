package main.Lectia1;

public class Algoritm {

	/* PUBLICE */
	public int[] sort(int[] v) {
		for (int i = 0; i < v.length - 1; i++) {
			for (int j = i + 1; j < v.length; j++) {
				if (v[j] < v[i]) {
					swap(v, i, j);
				}
			}
		}

		return v;
	}

	public String show(int[] vector) {
		String result = "";
		for (int i = 0; i < vector.length; i++) {
			result += vector[i] + " ";
		}
		return result;
	}

	public int sum(int[] vector) {
		int s = 0;
		for (int i = 0; i < vector.length; i++) {
			s += vector[i];
		}

		return s;
	}

	public boolean izCresc(int[] vector) {
		for (int i = 0; i < vector.length - 1; i++) {
			if (vector[i] > vector[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public boolean izDesc(int[] vector) {
		for (int i = 0; i < vector.length - 1; i++) {
			if (vector[i] < vector[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public String checkNumber(int nr, int[] vector) {
		if (isNumberInVector(nr, vector)) {
			return "Numarul " + nr + " se afla in vector!";
		}
		return "Numarul " + nr + " nu se afla in vector!";
	}

	public String getThatBoss(int[] vector) {
		return "Cel mai mare nr este " + getBigBoss(vector) + "!";
	}

	/* PRIVATE */
	private int[] swap(int[] vector, int i, int j) {
		int temp = vector[i];
		vector[i] = vector[j];
		vector[j] = temp;

		return vector;
	}

	private boolean isNumberInVector(int nr, int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			if (nr == vector[i]) {
				return true;
			}
		}
		return false;
	}

	private int getBigBoss(int[] vector) {
		int nr = 0;
		for (int i = 0; i < vector.length; i++) {
			nr = vector[i] > nr ? vector[i] : nr;
		}
		return nr;
	}

}
