import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;

public class Necklace {

	private static int getSecondToLast(ArrayList<Integer> list) {
		return list.get(list.size() - 2);
	}
	
	private static int getLast(ArrayList<Integer> list) {
		return list.get(list.size() - 1);
	}
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		out.print("Enter the first starting number: ");
		int num1 = stdin.nextInt();
		out.print("Enter the second starting number: ");
		int num2 = stdin.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(num1);
		list.add(num2);
		boolean keepGoing = true;
		while (keepGoing) {
			int sum = getSecondToLast(list) + getLast(list);
			int ones = sum % 10;
			list.add(ones);
			boolean firstNumFound = getSecondToLast(list) == num1;
			boolean secondNumFound = getLast(list) == num2;
			keepGoing = !(firstNumFound && secondNumFound);
		}
		
		list.forEach(i -> out.print(i + " "));
		stdin.close();
	}

}
