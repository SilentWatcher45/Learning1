package main.Exercitii;

public class Ex1 {
	public int sum(int a) {
		int s = 0;
		for (int j = 0; j <= a; j++) {
			s = s + j;
		}
		return s;
	}

	public int mult(int a) {
		int m = 1;
		for (int i = 1; i <= a; i++) {
			m = m * i;
		}
		return m;
	}

}
