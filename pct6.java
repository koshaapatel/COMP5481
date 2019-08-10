import java.util.ArrayList;
import java.util.Scanner;

public class pct6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ai = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			long l1 = sc.nextLong();
			long l2 = sc.nextLong();
			int k = 0, sum = 0, c = 0;
			while (l1 > 0 || l2 > 0) {
				int t1 = (int) (l1 % 10);
				int t2 = (int) (l2 % 10);
				sum = t1 + t2 + k;
				k = 0;
				if (sum > 9) {
					k = sum / 10;
					c++;
				}
				l1 = l1 / 10;
				l2 = l2 / 10;
			}
			ai.add(c);
		}
		if (ai.get(0).equals(ai.get(1))) {
			System.out.print("YES " + ai.get(0));
		} else if (ai.get(0) > ai.get(1)) {
			System.out.print("NO " + ai.get(0));
		} else {
			System.out.print("NO " + ai.get(1));
		}
	}
}
