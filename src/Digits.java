import java.util.Scanner;
public class Digits {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter a three-digit number: ");
		int num = stdin.nextInt();
		stdin.close();
		int ones = num % 10;
		int tens = num / 10 % 10;
		int hundreds = num / 100 % 10;
		System.out.printf("The hundreds-place digit is: %d\nThe tens-place digit is: %d\nThe ones-place digit is %d", hundreds, tens, ones);
	}

}
