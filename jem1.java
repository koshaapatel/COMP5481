import java.util.ArrayList;
import java.util.Scanner;

public class jem1 {
	public static ArrayList<String> ai = new ArrayList<>();

	public static void main(String[] args) {

		try {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int row = sc.nextInt();
			int a[][] = new int[row][];
			for (int i = 0; i < row; i++) {
				int t = sc.nextInt();
				a[i] = new int[t + 1];
				a[i][0] = t;
				for (int j = 1; j <= t; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println("opp");
			int opp = sc.nextInt();
			System.out.println("enter b:");
			int b[][] = new int[opp][2];
			for (int i = 0; i < b.length; i++) {
				b[i][0] = sc.nextInt();
				b[i][1] = sc.nextInt();
			}

			for (int i = 0; i < b.length; i++) {
				int ko = b[i][0]; // 1 3 2
				int ko1 = b[i][1]; // 2 1 5
				int ind = a[ko - 1][0]; // 4
				int ind1 = 0;
				if (ind != 0 && ko1 < a[ko - 1].length) {
					ind1 = a[ko - 1][ko1]; // 51
				}
				/*
				 * else { ind1=0; }
				 */

				if (ind == 0 || ind < ko1) {
					// System.out.println("error");
					ai.add("error");
				} else if (ko1 < a[ko - 1].length && ko - 1 >= 0 && ind1 != 0) {
					// System.out.println("ind1"+ind1);
					String stt = String.valueOf(ind1);
					ai.add(stt);
				}

			}
		} catch (Exception e) {

		} finally {
			for (String st1 : ai) {
				System.out.println(st1);
			}
		}
	}

}
