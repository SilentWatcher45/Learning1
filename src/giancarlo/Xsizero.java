package giancarlo;

import java.util.Scanner;

public class Xsizero {

	private String[][] tabla = { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };

	public String player1 = "";
	public String player2 = "";
	
	public void selectName() {
		Scanner jucator = new Scanner(System.in);
		System.out.println("Introduceti numele jucatorilor: ");
		
		String jucator1 = jucator.nextLine();
		System.out.println("Jucator1: " + jucator1 + " :" + " " + "X");
		String jucator2 = jucator.nextLine();
		System.out.println("Jucator2: " + jucator2 + " :" + " " + "O");
		
//		player1 = "Jucator1: " + player1Name;
//		System.out.println(player1);
//		player2 = "Jucator2: " + player2Name;
//		System.out.println(player2);
	}

	public String[][] getTabla() {
		return tabla;
	}

	public void setTabla(String[][] tabla) {
		this.tabla = tabla;
	}

	public void update(int i, int j, String choice) {
		tabla[i][j] = choice;

	}

	public void showTable() {
		System.out.println(" " + tabla[0][0] + " " + "|" + " " + tabla[0][1] + " " + "|" + " " + tabla[0][2] + " ");
		System.out.println("-----------");
		System.out.println(" " + tabla[1][0] + " " + "|" + " " + tabla[1][1] + " " + "|" + " " + tabla[1][2] + " ");
		System.out.println("-----------");
		System.out.println(" " + tabla[2][0] + " " + "|" + " " + tabla[2][1] + " " + "|" + " " + tabla[2][2] + " ");
	}

	public void refreshTable() {
		String[][] newTabla = { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };
		this.tabla = newTabla;
	}

	public void startGame() {
		Scanner pozitie = new Scanner(System.in);
		int i = 0; 
		int j = 0;
		String poz = tabla[i][j];
		String jucator1 = pozitie.nextLine();
		System.out.println("pozitia " + poz);
		
		player1 = "X";
		player2 = "O";
	}


}
