package main.Exercitii;

public class Vectori2 {
	private void swap(int[] sortat, int f, int j) {
		for (int f1 = 0; f1 < sortat.length - 1; f1++) {
			for (int j1 = f1 + 1; j1 < sortat.length; j1++) {
				if (sortat[j1] < sortat[f1]) {
					swap (sortat, f1, j1);
				}
			}
		}
		
	}

}
