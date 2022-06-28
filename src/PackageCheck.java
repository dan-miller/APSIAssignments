import java.util.Scanner;
import static java.lang.System.out;
public class PackageCheck {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int kgs, l, w, h;
		out.print("Enter the package weight in kilograms: ");
		kgs = stdin.nextInt();
		out.print("Enter the package length in centimeters: ");
		l = stdin.nextInt();
		out.print("Enter the package width in centimeters: ");
		w = stdin.nextInt();
		out.print("Enter the package height in centimeters: ");
		h = stdin.nextInt();
		
		boolean tooHeavy = kgs > 27;
		boolean tooLarge = l * w * h > 100000;
		
		if (tooHeavy && tooLarge) {
			out.println("Too heavy and too large.");
		} else if (tooHeavy) {
			out.println("Too heavy.");
		} else if (tooLarge) {
			out.println("Too large.");
		}
		stdin.close();
	}

}
