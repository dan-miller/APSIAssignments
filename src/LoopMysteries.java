import java.util.ArrayList;
import java.util.Arrays;

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

	public static void arrayListMystery1(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			int n = list.get(i);
			if (n%10 == 0) {
				list.remove(i);
				list.add(n);
			}
		}
		System.out.println(list);
	}
	
	public static void mystery(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i+=2) {
			int el = list.get(i);
			list.remove(i);
			list.add(el);
		}
		System.out.println(list);
	}
	
	public static void mystery2(ArrayList<Integer> list) {
		for (int i = list.size() - 1; i > 0 ; i--) {
			if (list.get(i) < list.get(i-1)) {
				int n = list.get(i);
				list.remove(i);
				list.add(0, n);
			}
		}
		System.out.println(list);
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
	public static void mystery3(ArrayList<Integer> list) {
		for (int i = list.size() - 1; i >= 0; i--) {
			if (i%2 == 0) {
				list.add(list.get(i));
			} else {
				list.add(0, list.get(i));
			}
		}
		System.out.println(list);
	}
	
	public static void mystery4(ArrayList<Integer> list) {
		for (int i = list.size() - 2; i > 0; i--) {
			int a = list.get(i);
			int b = list.get(i+1);
			list.set(i, a+b);
		}
		System.out.println(list);
	}
	
	public static void mystery5(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			int element = list.get(i);
			list.remove(i);
			list.add(0, element+1);
		}
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		mystery5(new ArrayList<Integer>(Arrays.asList(-1, 3, 28, 17, 9, 33)));
		
		
	}
}
