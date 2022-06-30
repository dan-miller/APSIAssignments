import java.util.Arrays;
import java.util.Scanner;

public class Mankala {
	private static int bin1 = 0;
	private static int bin2 = 0;
	private static int[] pits = new int[] {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}; // pit0 is lower left from player one's perspective
	private static void printBoard() {
		System.out.println();
		System.out.println("============");
		System.out.println();
		for (int i = 11; i >= 6; i--) {
			System.out.print(" " + pits[i]);
		}
		System.out.println();
		System.out.println(bin2 + "           " + bin1);
		for (int i = 0; i <= 5; i++) {
			System.out.print(" " + pits[i]);
		}
		System.out.println();
		System.out.println(" A B C D E F");
	}
	
	public static void main(String[] args) {
		var player = 1;
		boolean play = true, goAgain = false;
		var winner = "";
		var stdin = new Scanner(System.in);
		char pit;
		int startPos = 0, curPos = 0, stones;
		while (play) {
			printBoard();
			System.out.println();
			System.out.print("Player " + player + "'s turn. Enter pit letter: ");
			pit = stdin.nextLine().toCharArray()[0];
			
			switch (pit) {
			case 'A':
				startPos = player == 1 ? 0 : 11;
				break;
			case 'B':
				startPos = player == 1 ? 1 : 10;
				break;
			case 'C':
				startPos = player == 1 ? 2 : 9;
				break;
			case 'D':
				startPos = player == 1 ? 3 : 8;
				break;
			case 'E':
				startPos = player == 1 ? 4 : 7;
				break;
			case 'F':
				startPos = player == 1 ? 5 : 6;
				break;
			}
			
			stones = pits[startPos];
			pits[startPos] = 0;
			curPos = startPos;
			while (stones > 0) {				
				if (curPos == 5 && player == 1 && stones > 0) {
					bin1++;
					stones--;
				} else if (curPos == 11 && player == 2 & stones > 0) {
					bin2++;
					stones--;
				}
				if (stones == 0) {
					goAgain = true;
					break;
				}
				
				curPos = (curPos + 1) % 11;
				pits[curPos]++;
				stones--;
				
				if (stones == 0) {
					if (player == 1 && Arrays.asList(0, 1, 2, 3, 4, 5).contains(curPos)) {
						bin1 += pits[curPos + 6];
						pits[curPos + 6] = 0;
					} else if (player == 2 && Arrays.asList(6, 7, 8, 9, 10, 11).contains(curPos)) {
						bin2 += pits[curPos - 6];
						pits[curPos - 6] = 0;
					}
				}
			}
			
			
			if (goAgain) {
				goAgain = false;
			} else {
				player = player == 1 ? 2 : 1;
				if ((player == 1 && pits[0] == 0 && pits[1] == 0 && pits[2] == 0 && pits[3] == 0 && pits[4] == 0 && pits[5] == 0)
					 || (player == 2 && pits[6] == 0 && pits[7] == 0 && pits[8] == 0 && pits[9] == 0 && pits[10] == 0 && pits[11] == 0)) {
					play = false;
					
					if (player == 1) {
						bin2 += (pits[6] + pits[7] + pits[8] + pits[9] + pits[10] + pits[11]);
						pits[6] = 0;
						pits[7] = 0;
						pits[8] = 0;
						pits[9] = 0;
						pits[10] = 0;
						pits[11] = 0;
					} else {
						bin1 += (pits[0] + pits[1] + pits[2] + pits[3] + pits[4] + pits[5]);
						pits[0] = 0;
						pits[1] = 0;
						pits[2] = 0;
						pits[3] = 0;
						pits[4] = 0;
						pits[5] = 0;
					}
				}
			}
		}
		
		if (bin1 > bin2) {
			winner = "Player 1";
		} else if (bin2 > bin1) {
			winner = "Player 2";
		} else {
			winner = "No one. It's a tie.";
		}
		
		System.out.println("Game over. Winner: " + winner);
		
		stdin.close();
	}
}
