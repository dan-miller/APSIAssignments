import java.util.Scanner;

public class CubesSum {

	private static int sumOfCubes(int value) {
		char[] charArr = String.valueOf(value).toCharArray();
		int sum = 0;
		for (int i = 0; i < charArr.length; i++) {
			sum += Math.pow(Integer.parseInt(String.valueOf(charArr[i])), 3);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int input = stdin.nextInt();
		int sum = sumOfCubes(input);
		System.out.printf("The sum of the cubes of %s is %d.\n", input, sum);
		
		int counter = 10;
		while (counter <= 9999) {
			if (sumOfCubes(counter) == counter) {
				System.out.println(counter);
			}
			counter++;
			
		}
		stdin.close();
	}

}
