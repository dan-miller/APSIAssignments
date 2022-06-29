
public class PrimeFactors {

	public static void main(String[] args) {
		java.util.Scanner stdin = new java.util.Scanner(System.in);
		System.out.print("Enter number to retrieve its prime factors: ");
		int input = stdin.nextInt();
		int counter = 2;
		while (counter <= input) {
			if (input % counter == 0) {
				System.out.println(counter);
				input /= counter;
			} else {
				counter++;
			}
		}
		stdin.close();
	}

}
