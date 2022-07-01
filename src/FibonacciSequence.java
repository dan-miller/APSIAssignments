import java.util.Scanner;
public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println("This program lists the Fibonacci sequence.");
        System.out.print("Max value? ");
        Scanner stdin = new Scanner(System.in);
        int max = stdin.nextInt();
        int num1 = 0;
        int num2 = 1;
        int next = 1;
        System.out.print("0, 1");
        while (num1 + num2 <= max) {
            next = num1 + num2;
            num1 = num2;
            num2 = next;
            System.out.print(", " + next);
        }
        stdin.close();
    }
}