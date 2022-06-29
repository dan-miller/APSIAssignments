
public class LoopMysteries {
	public static int loopMysteryExam3(int x, int y) {
		int z = x + y;
		while (x > 0 && y > 0) {
			x = x - y;
			y--;
			System.out.print(x + " " + y + " ");
		}
		System.out.println(y);
		return z;
	}
	
	public static void loopMysteryExam5(int x, int y) {
		int z = y;
		while (x % z == 0) {
			System.out.print("(" + x + " " + z + ") ");
			x = x - z;
			z++;
		}
		System.out.println("(" + x + " " + z + ") " + y);
	}
	
	public static void whileMystery(int x, int y) {
		int z = 0;
		while (x % y != 0) {
			x = x / y;
			z++;
			System.out.print(x + ", ");
			
		}
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		System.out.println(loopMysteryExam3(7, 5));
		System.out.println(loopMysteryExam3(20, 4));
		System.out.println(loopMysteryExam3(40, 10));
		
		loopMysteryExam5(12, 4);
		loopMysteryExam5(14, 2);
		loopMysteryExam5(27, 3);
		
		whileMystery(25, 2);
		whileMystery(32, 4);
		whileMystery(10345, 10);
		whileMystery(63, 2);
	}
}
