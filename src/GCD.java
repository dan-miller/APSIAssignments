import java.util.Scanner;
import static java.lang.System.out;
public class GCD {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		out.print("Enter a number: ");
		int num1 = stdin.nextInt();
		out.print("Enter a second number: ");
		int num2 = stdin.nextInt();
		int temp = 0;
		while (num2 > 0) {
			temp = num1 % num2;
			num1 = num2;
			num2 = temp;
		}
		
		out.printf("The GCD is %d.", num1);
		stdin.close();
	}

}
