import java.util.Scanner;
public class AreaRect {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter the length and width separated by a space:");
		String input = stdin.nextLine();
		stdin.close();
		int area = Integer.parseInt(input.split(" ")[0]) * Integer.parseInt(input.split(" ")[1]);
		System.out.printf("The area is %s.", area);
	}
}
