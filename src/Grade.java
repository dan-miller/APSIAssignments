import java.util.Scanner;
public class Grade {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter the percentage: ");
		int grade = stdin.nextInt();
		char letter = '?';
		
		if (90 <= grade && grade <= 100) {
			letter = 'A';
		} else if (80 <= grade && grade <= 89) {
			letter = 'B';
		} else if (70 <= grade && grade <= 79) {
			letter = 'C';
		} else if (60 <= grade && grade <= 69) {
			letter = 'D';
		} else if (grade < 59) {
			letter = 'F';
		} else {
			System.err.println("Invalid percentage. Try again.");
			System.exit(0);
		}
		
		System.out.printf("The corresponding letter grade is: %s", letter);
		stdin.close();
	}
}
