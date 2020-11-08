package main.Tema2;

public class Vector {

	public int amprenta(int[] v) {

		int amp = 0;

		for (int i = 0; i < v.length; i++) {
			if (i % 2 == 0) {
				if (i % 3 == 0) {
					if (i % 5 == 0) {
						amp = amp * v[i];
					} else
						amp = amp / v[i];
				} else
					amp = amp - v[i];
			} else
				amp = amp + v[i];
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					amp = amp * v[i];
				} else
					amp = amp / v[i];
			} else
				amp = amp - v[i];
		}
		return amp;
	}



	public int amprenta1(int[] v) {

		int amp = 0;

		for (int i = 0; i < v.length; i++) {
			if (i % 2 == 0) {
				amp = amp - v[i];
				if (i % 3 == 0) {
					amp = amp + v[i];
					if (i % 5 == 0) {
						amp = amp * v[i];
					} else
						amp = amp / v[i];
				} else
					amp = amp - v[i];
			} else
				amp = amp + v[i];
			if (i % 3 == 0) {
				amp = amp + v[i];
				if (i % 5 == 0) {
					amp = amp * v[i];
				} else
					amp = amp / v[i];
			} else
				amp = amp - v[i];
		}
		return amp;
	}

}