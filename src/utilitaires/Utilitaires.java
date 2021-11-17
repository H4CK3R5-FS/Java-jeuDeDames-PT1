package utilitaires;


import java.util.Iterator;

import model.Pion;

public class Utilitaires {
public static void draw_Board(String[][] board) {

	for (int i =0; i<board.length; i++) {
		for(int j = 0;j<board[i].length;j++) {
			board[i][j]=".";
			board[0][0]="*";
			board[0][board[i].length-1]="*";
			board[board.length-1][0]="*";
			board[board.length-1][board[i].length-1]="*";
		}
		
	}
	add_Boarders_To_Board(board);
}
public static void add_Boarders_To_Board(String[][] board) {
	String letters ="ABCDEFGH";
	String numbers="12345678";
	for (int i =1; i<board.length-1; i++) {
		for(int j = 1;j<board[i].length-1;j++) {
			board[0][j]=String.valueOf(letters.charAt(j-1));
			board[board.length-1][j]=String.valueOf(letters.charAt(j-1));
			board[i][0]=String.valueOf(numbers.charAt(i-1));
			board[i][board[i].length-1]=String.valueOf(numbers.charAt(i-1));
		}
	}
}
public static void add_Pieces_To_List() {
	
}
public static void add_Pieces_To_Board() {
	
}
public static void read_Board(String[][] board) {
	for (int i =0; i<board.length; i++) {
		for(int j = 0;j<board[i].length;j++) {
			System.out.print("		"+board[i][j]);
		}
		System.out.println("\n\n\n\n");
	}
}
}
