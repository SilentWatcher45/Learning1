package giancarlo;


public class Main {

	public static void main(String[] args) {
//		TutoCatzo tc = new TutoCatzo();
//		
//		String fraza = "Ana aVea NIste mere, dAr le-a piredut!";
//		int[] v1 = {7, 2, 8, 4, 1, 3, 3, 6};
//		String[] v2 = {"Par$ka", "cL%!e Ar", "W  iND $o$ W"};
//		
//		tc.showVector(tc.vectore(v1));
//		System.out.println();
//		tc.showVector(tc.cleanStringVector(v2));
//
//		System.out.println();
//		if (tc.getAlfabet().length > 0) {
//			System.out.println("Alfabet OK! ");
//			
//			System.out.println(tc.curatareBinara(fraza));
//		}else { 
//			System.out.println("Alfabet Not OK!!!!! ");
//		}
//		
		Xsizero joc = new Xsizero();
		
		joc.selectName();
		System.out.println();
		joc.showTable();
		joc.startGame();
		
	}

}
