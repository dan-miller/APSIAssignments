import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter the time in minutes: ");
		int mins = stdin.nextInt();
		stdin.close();
		int h = mins / 60;
		int m = mins % 60;
		System.out.println("The time is: " + h + ":" + m);

	}

}
