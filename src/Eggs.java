import java.util.Scanner;

public class Eggs {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter the number of eggs purchased: ");
		int eggs = stdin.nextInt();
		double total;
		int dozens = eggs / 12;
		int extras = eggs % 12;
		
		if (0 < eggs && eggs < 4 * 12) {
			total = dozens * .5;
			total += extras * (.5 / 12);
		} else if ( 4 * 12 <= eggs && eggs < 6 * 12) {
			total = dozens * .45;
			total += extras * (.45 / 12);
		} else if (6 * 12 <= eggs & eggs < 11 * 12) {
			total = dozens * .4;
			total += extras * (.4 / 12);
		} else if (11 * 12 <= eggs) {
			total = dozens * .35;
			total += extras * (.35 / 12);
		} else {
			total = 0;
		}
		
		System.out.printf("The bill is equal to: $%.2f", total);
		
		stdin.close();
	}
}
