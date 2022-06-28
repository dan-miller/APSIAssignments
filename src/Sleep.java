import java.util.Scanner;
import static java.lang.System.out;
public class Sleep {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		out.println("Enter your birthdate:");
		out.print("Year: ");
		int year = stdin.nextInt();
		out.print("Month: ");
		int month = stdin.nextInt();
		out.print("Day: ");
		int day = stdin.nextInt();
		out.println("Enter today's date: ");
		out.print("Year: ");
		int tyear = stdin.nextInt();
		out.print("Month: ");
		int tmonth = stdin.nextInt();
		out.print("Day: ");
		int tday = stdin.nextInt();
		stdin.close();
		int yeardiff = tyear - year;
		int monthdiff = tmonth - month;
		int daydiff = tday - day;
		int totalDays = (yeardiff * 365) + (monthdiff * 30) + daydiff;
		var sleptHours = totalDays * 8;
		out.printf("You have been alive for %,d days.\n", totalDays);
		out.printf("You have slept %,d hours.", sleptHours);
	}
}
