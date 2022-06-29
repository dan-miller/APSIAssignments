
public class Investment {

	public static void main(String[] args) {
		double a = 0;
		int P = 2500;
		double r = .075;
		int n = 1;
		int t = 0;
		
		while (a < 5000) {
			a = P * Math.pow(1 + r/n, (n*t));
			t++;
		}
		
		System.out.printf("It will take %d years for the investment to be worth $%.2f.", t, a);
		
	}

}
