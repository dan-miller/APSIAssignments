import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		var stdin = new Scanner(System.in);
		System.out.print("Enter a word to test if it is a palindrome: ");
		var input = stdin.nextLine().toCharArray();
		
		for (var i = 0; i < input.length; i++) {
			if (input[i] != input[input.length - 1 -i]) {
				System.out.println("Not a palindrome");
				System.exit(0);
			}
		}
		System.out.println("It's a palindrome");
		stdin.close();
	}

}
