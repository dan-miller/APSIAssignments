import java.util.Scanner;
import static java.lang.System.out;
public class Change {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		out.print("Enter the change in cents: ");
		int cents = stdin.nextInt();
		out.println("The minimum number of coins is:");
		
		int quarters = cents / 25;
		cents -= quarters * 25;
		int dimes = cents / 10;
		cents -= dimes * 10;
		int nickels = cents / 5;
		cents -= nickels * 5;
		out.printf("\tQuarters: %d\n", quarters);
		out.printf("\tDimes: %d\n", dimes);
		out.printf("\tNickels: %d\n", nickels);
		out.printf("\tPennies: %d\n", cents);
		
		stdin.close();
	}

}
