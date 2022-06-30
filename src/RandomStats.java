import java.util.Random;
public class RandomStats {

	public static void main(String[] args) {
		var r = new Random();
		var freq = new int[10];
		for (int i = 0; i < 500; i++) {
			freq[r.nextInt(10)]++;
		}
		System.out.printf("Number\tOccurrences\n");
		for (int i = 0; i < freq.length; i++) {
			System.out.printf("%d\t%d\n", i, freq[i]);
		}
	}

}
