import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CountConsonants {

	public static void main(String[] args) {
		var stdin = new Scanner(System.in);
		var ingnoreChars = new ArrayList<Character>(Arrays.asList(' ', 'a', 'e', 'i', 'o', 'u'));
		System.out.print("Enter text: ");
		var input = stdin.nextLine().toCharArray();
		var consonants = 0;		
		for (int i = 0; i < input.length; i++) {
			if (!ingnoreChars.contains(input[i])) {
				consonants++;
			}
		}
		System.out.println("The number of consonants in " + String.valueOf(input) + " is " + consonants);
		stdin.close();
	}

}
