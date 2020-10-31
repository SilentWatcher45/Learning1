package main.Lectia1;

public class Numar {
	public int sum(int a) {
		int s = 0;
		for (int i = 1; i <= a; i++) {
			s = s + i;
		}
		return s;
	}

	public String media(Double a, Double b) {
		Double m = (a + b) / 2;

		return "Media este " + m;
	}

	public int fact(int a) {
		int f = 1;
		for (int i = 1; i <= a; i++) {
			f = f * i;
		}
		return f;
	}

}
