import java.util.ArrayList;

public class Hailstone1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 200; i++) {
			System.out.println("Current starting value: " + i);
			boolean keepGoing = true;
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(i);
			while (keepGoing) {
				int next = list.get(list.size() - 1);
				if (next % 2 == 0) {
					list.add(next/2);
				} else {
					list.add(next*3 + 1);
				}
				
				if (list.size() < 6) continue;
				
				boolean sixthToLastIs4 = list.get(list.size() - 6) == 4;
				boolean fifthToLastIs2 = list.get(list.size() - 5) == 2;
				boolean fourthToLastIs1 = list.get(list.size() - 4) == 1;
				boolean thirdToLastIs4 = list.get(list.size() - 3) == 4;
				boolean secondToLastIs2 = list.get(list.size() - 2) == 2;
				boolean lastIs1 = list.get(list.size() - 1) == 1;
				keepGoing = !(sixthToLastIs4 && fifthToLastIs2 && fourthToLastIs1 && thirdToLastIs4 && secondToLastIs2 && lastIs1);
			}
		}
		System.out.println("Program has ended, all numbers between 1 and 200 are hailstone numbers.");
		
	}

}
