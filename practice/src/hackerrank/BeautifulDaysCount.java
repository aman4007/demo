package hackerrank;

public class BeautifulDaysCount {

	static int beautifulDays(int a, int b, int k) {
		int rem = 0, rev = 0, count = 0;
		for (int i = a; i <= b; i++) {
			int n = i;
			for (; n > 0; n = n / 10) {
				rem = n % 10;
				rev = rev * 10 + rem;
			}
			if (Math.abs(rev - i) % k == 0) {

				count++;
			}
			rev = 0;

		}
		return count;

	}

	public static void main(String[] args) {
		System.out.println("In Main");
		System.out.println("Output" + beautifulDays(20, 23, 6));

	}

}
