import java.util.ArrayList;
import java.util.Scanner;

public class Analysis {
	private static String getHistStars(int num) {
		return new String(new char[num]).replace('\0', '*');
	}
	
	public static void main(String[] args) {
		var list = new ArrayList<Integer>();
		var stdin = new Scanner(System.in);
		String input;
		int inputInt;
		System.out.println("Enter numbers 1-50. Enter STOP to stop.");
		while(true) {
			input = stdin.nextLine();
			if (input.equals("STOP")) break;
			inputInt = Integer.parseInt(input);
			if (inputInt < 1 || inputInt > 50) {
				System.err.println("Out of range. 1 - 50 only. Try again.");
				continue;
			}
			list.add(Integer.parseInt(input));
		}
		
		if (list.size() == 0) System.exit(0);
		
		int curVal, total = 0, max = 0, min = Integer.MAX_VALUE;
		var freq = new int[50];
		var hist = new int[10];
		
		for (int i = 0; i < list.size(); i++) {
			curVal = list.get(i);
			total += curVal;
			max = curVal > max ? curVal : max;
			min = curVal < min ? curVal : min;
			freq[curVal-1]++;
			
			if (1 <= curVal && curVal <= 5) {
				hist[0]++;
			} else if ( 6 <= curVal && curVal <= 10) {
				hist[1]++;
			} else if ( 10 <= curVal && curVal <= 15) {
				hist[2]++;
			} else if ( 16 <= curVal && curVal <= 20) {
				hist[3]++;
			} else if ( 21 <= curVal && curVal <= 25) {
				hist[4]++;
			} else if ( 26 <= curVal && curVal <= 30) {
				hist[5]++;
			} else if ( 31 <= curVal && curVal <= 35) {
				hist[6]++;
			} else if ( 36 <= curVal && curVal <= 40) {
				hist[7]++;
			} else if ( 41 <= curVal && curVal <= 45) {
				hist[8]++;
			} else {
				hist[9]++;
			}
		}
	
		System.out.println("Statistics");
		System.out.printf("Average:\t%f\n", (double)total / list.size());
		System.out.printf("Max:\t\t%d\n", max);
		System.out.printf("Range:\t\t%d\n", max - min);
		
		int median = 0, maxVal = 0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > maxVal) {
				maxVal = freq[i];
				median = i + 1;
			}
		}
		System.out.printf("Median:\t\t%d\n", median);
		System.out.println("=================");
		System.out.printf(" 1 -  5 :  %s\n", getHistStars(hist[0]));
		System.out.printf(" 6 - 10 :  %s\n", getHistStars(hist[1]));
		System.out.printf("10 - 15 :  %s\n", getHistStars(hist[2]));
		System.out.printf("16 - 20 :  %s\n", getHistStars(hist[3]));
		System.out.printf("21 - 25 :  %s\n", getHistStars(hist[4]));
		System.out.printf("26 - 30 :  %s\n", getHistStars(hist[5]));
		System.out.printf("31 - 35 :  %s\n", getHistStars(hist[6]));
		System.out.printf("36 - 40 :  %s\n", getHistStars(hist[7]));
		System.out.printf("41 - 45 :  %s\n", getHistStars(hist[8]));
		System.out.printf("46 - 50 :  %s\n", getHistStars(hist[9]));

		stdin.close();
	}

}
