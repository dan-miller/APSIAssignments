import java.util.Random;
import java.util.Scanner;

public class MathTutor {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		Random rand = new Random();
		int num1 = rand.nextInt(10) + 1;
		int num2 = rand.nextInt(10) + 1;
		int ans;
		
		switch (rand.nextInt(4)) {
			case 0: 
				System.out.printf("What is %d + %d? ", num1, num2);
				ans = stdin.nextInt();
				if (ans == (num1 + num2)) {
					System.out.println("Correct!");
				} else {
					System.out.println("Nope... the correct answer is: " + (num1 + num2));
				}
				break;
			case 1:
				System.out.printf("What is %d - %d? ", num1, num2);
				ans = stdin.nextInt();
				if (ans == (num1 - num2)) {
					System.out.println("Correct!");
				} else {
					System.out.println("Nope... the correct answer is: " + (num1 - num2));
				}
				break;
			case 2:
				System.out.printf("What is %d * %d? ", num1, num2);
				ans = stdin.nextInt();
				if (ans == (num1 * num2)) {
					System.out.println("Correct!");
				} else {
					System.out.println("Nope... the correct answer is: " + (num1 * num2));
				}
				break;
			case 3:
				System.out.printf("What is %d / %d? ", num1, num2);
				ans = stdin.nextInt();
				if (ans == (num1 / num2)) {
					System.out.println("Correct!");
				} else {
					System.out.println("Nope... the correct answer is: " + (num1 / num2));
				}
				break;
		}
		
		stdin.close();
	}
}
