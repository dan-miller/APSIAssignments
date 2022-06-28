import java.util.Scanner;

public class CarRecall {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter the car's model number: ");
		int model = stdin.nextInt();
		if (model == 119
			|| model == 179
			|| (189 <= model && model <= 195)
			|| model == 221
			|| model == 780) {
			System.out.println("Your car is defective. It must be repaired");
		} else {
			System.out.println("Your car is not defective");
		}
		stdin.close();
	}
}
