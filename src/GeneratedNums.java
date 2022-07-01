
public class GeneratedNums {

	public static void main(String[] args) {
		int curVal, newVal;
		var arr = new int[101];
		for (int i = 0; i < arr.length; i++) {
			//Store the current index so it can be manipulated
			curVal = i;
			//Get the ones digit
			newVal = curVal % 10;
			//Get the tens digit, if it exists
			curVal /= 10;
			if (curVal > 0) {
				newVal += curVal % 10;
			}
			//Get the hundreds digit, if it exists
			curVal /= 10;
			if (curVal > 0) {
				newVal += curVal % 10;
			}
			//Set the current index to the sum of the digits of the index, plus the index itself
			arr[i] = newVal + i;
		}
		
		System.out.println("Index    Generated Number");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d\t%d\n", i, arr[i]);
		}
	}

}
