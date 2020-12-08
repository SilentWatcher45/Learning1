package giancarlo;

public class TutoCatzo {

	private String[] alfabeth ={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","x","y","z"};

	public int[] vectore(int[] v) {
		for (int i = 0; i < v.length; i++) {
			if (v[i] % 2 == 1) {
				v[i] *= 2;
			}
		}
		return v;
	}

	public void showVector(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
	}

	public String[] cleanStringVector(String[] vector) {
		for (int i = 0; i < vector.length; i++) {
			vector[i] = vector[i].replaceAll("[$!% ]", "").toLowerCase();
		}
		return vector;
	}

	public void showVector(String[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
	}
	
	public String[] getAlfabet () {
		return this.alfabeth;
	}
	
	public String curatareBinara(String model) {
		
		for (int i = 0; i < alfabeth.length; i++) {
			if (i % 2 == 0) {
				model = model.replaceAll(alfabeth[i], alfabeth[i].toUpperCase());
			} else {
				model = model.replaceAll(alfabeth[i].toUpperCase(), alfabeth[i]);
			}
				
		}
		return model;
	}
}
