import java.util.Scanner;

public class PizzaCost {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter the diameter of the pizza in inches: ");
		int diam = stdin.nextInt();
		double labor = .75;
		int rent = 1;
		double materials = .05 * Math.pow(diam, 2);
		double total = labor + rent + materials;
		System.out.printf("The cost of making the pizza is $%.2f", total);
		stdin.close();
		
	}

}
