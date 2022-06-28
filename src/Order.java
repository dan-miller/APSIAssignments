import java.util.Scanner;
import static java.lang.System.out;
public class Order {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		out.print("Enter the number of burgers: ");
		int burgers = stdin.nextInt();
		out.print("Enter the number of fries: ");
		int fries = stdin.nextInt();
		out.print("Enter the number of sodas: ");
		int sodas = stdin.nextInt();
		double burgersTotal = burgers * 1.69;
		double friesTotal = fries * 1.09;
		double sodasTotal = sodas * .99;
		double totalPreTax = burgersTotal + friesTotal + sodasTotal;
		out.printf("Total before tax: $%.2f\n", totalPreTax);
		double tax = totalPreTax * 0.065;
		out.printf("Tax: $%.2f\n", tax);
		double total = totalPreTax + tax;
		out.printf("Final total: $%.2f\n", total);
		out.print("Enter amount tendered: $");
		double tendered = stdin.nextDouble();
		stdin.close();
		if (tendered < total) {
			out.println("Not enough money; no food for you, buster.");
			System.exit(0);
		}
		out.printf("Change: $%.2f", tendered - total);
	}

}
