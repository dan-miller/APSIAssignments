import java.util.Scanner;
import static java.lang.System.out;
public class DivAndMod {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		out.print("Enter an integer: ");
		int i1 = stdin.nextInt();
		out.print("Enter a second integer: ");
		int i2 = stdin.nextInt();
		stdin.close();
		
		String divf = "%d / %d = %d\n";
		String modf = "%d %% %d = %d\n";
		out.printf(divf, i1, i2, i1/i2);
		out.printf(modf, i1, i2, i1%i2);
		out.println();
		out.printf(divf, i2, i1, i2/i1);
		out.printf(modf, i2, i1, i2%i1);
	}

}
