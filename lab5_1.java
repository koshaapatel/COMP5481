import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class lab5_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ii = 0;
		String str = new String();
		String a = new String();
		String letters = new String();
		ArrayList<String> ar = new ArrayList<String>();
		ArrayList<String> op = new ArrayList<String>();
		ArrayList<Integer> loc = new ArrayList<>();
		ArrayList<Integer> output = new ArrayList<>();

		str = sc.nextLine();
		letters = sc.nextLine();
		char ch[] = letters.toCharArray();
		if (str.length() < 70 && letters.length() < str.length()) {
			int l = letters.length();
			while (l != str.length()) {
				for (int i = 0; i <= str.length() - l; i++) {
					a = str.substring(i, i + l);
					ar.add(a);
				}
				l++;
			}
		}

		for (int i = 0; i < ch.length; i++) {
			loc.add(i, 1);
		}

		for (int j = 0; j < ar.size(); j++) {
			ArrayList<Integer> checked = new ArrayList<>();
			int loc1[] = new int[loc.size()];
			Arrays.fill(loc1, 1);
			/*
			 * for (int o = 0; o < loc.size(); o++) { loc1[o] = loc.get(o).intValue(); }
			 */
			for (int p = 0; p < ch.length; p++) {
				int f = loc.get(p);
				String z = ar.get(j);
				for (int k = 0; k < z.length(); k++) {
					if (ch[p] == z.charAt(k) && !checked.contains(k) && f != 0) {
						f--;
						loc1[p] = f;
						checked.add(k);
						break;
					}
				}
			}

			int y = 0;
			for (int i = 0; i < loc1.length; i++) {
				y += loc1[i];
			}
			if (y == 0) {
				op.add(ii, ar.get(j));
				output.add(ii, ar.get(j).length());
				ii++;
			}
		}
		int opi = Collections.min(output);
		for (int i = 0; i < output.size(); i++) {
			if (output.get(i).equals(opi)) {
				System.out.println(op.get(i));
				break;
			}
		}
		sc.close();
	}
}

/*
 * letters = sc.nextLine();
 * 
 * for (int i = 0; i < letters.length(); i++) { if
 * (!sar.contains(letters.valueOf(letters.charAt(i)))) {
 * sar.add(letters.valueOf(letters.charAt(i)).toString()); } } for (int i = 0; i
 * < sar.size(); i++) { System.out.println("sar:" + sar.get(i)); }
 * System.out.println("sar size" + sar.size());
 * 
 * char ch[] = letters.toCharArray();
 */
