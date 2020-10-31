package main.Exercitii;

public class Vectori {

	public String parity(int[] v, String check) {
		String pare = "pare: ";
		String impare = "impare: ";
		String result = "";

		for (int i = 0; i < v.length; i++) {
			if (v[i] % 2 == 0) {
				pare += v[i] + " ";
			} else {
				impare += v[i] + " ";
			}
		}

		switch (check) {
		case "pare": {
			result = pare;
			break;
		}
		case "impare": {
			result = impare;
			break;
		}
		case "totale": {
			result = pare + "\n" + impare;
			break;
		}

		}

		return result;
	}

//	public String par(int[] v) {
//		for (int i = 0; i < v.length; i++) {
//			if (v[i] % 2 == 1) {
//				pare += v[i];
//			}
//		}
//		return pare;
//	}
//
//	public String impar(int[] vector) {
//		String impare = "";
//		for (int i = 0; i < vector.length; i++) {
//			if (vector[i] % 2 == 0) {
//				impare += vector[i] + " ";
//			}
//		}
//		return impare;
//	}

//	public int[] ort(int[] sortat, int f1, int j1) {
//		for (int f11 = 0; f11 < sortat.length - 1; f11++) {
//			for (int j11 = f11 + 1; j11 < sortat.length; j11++) {
//				if (sortat[j11] < sortat[f11]) {
//					swap (sortat, f11, j11);
//				}
//			}
//		}
//		return sortat;
//	}
//

}
