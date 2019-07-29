import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		ArrayList<Character> ar = new ArrayList<Character>();
		ArrayList<String> ar1 = new ArrayList<String>();
		Set<Character> cset = new HashSet<Character>();
		Set<String> sset = new HashSet<String>();
		a = sc.nextInt();
		String s[] = new String[a];
		sc.nextLine();

		for (int i = 0; i < a; i++) {
			s[i] = sc.nextLine();
		}
		b = sc.nextInt();
		switch (b) {
		case 1:
			for (String sn : s) {
				sn = sn.replaceAll("[^a-z]", "");// [^a-zA-Z0-9]
				char[] carray = sn.toCharArray();

				for (Character c : carray) {
					ar.add(c);
					cset.add(c);
				}
			}
			ArrayList<Integer> max = new ArrayList<Integer>(cset.size());
			ArrayList<Character> max_c = new ArrayList<Character>(cset.size());
			char chk = '1';
			for (Character c : cset) {
				max.add(Collections.frequency(ar, c));
				max_c.add(c);
			}

			Integer imax = Collections.max(max);
			for(int i=0; i<max_c.size(); i++) {
				chk = max_c.get(max.indexOf(imax));
			}
			System.out.print("Unigram "+chk);
			break;

		case 2:
			for (String sn : s) {
				sn = sn.replaceAll("[^a-z]", "");// [^a-zA-Z0-9]
				ArrayList<String> sarray = new ArrayList<String>();
				for(int i=0; i<sn.length()-1; i++) {
					sarray.add(sn.substring(i, i+2));
				}

				for (String c : sarray) {
					ar1.add(c);
					sset.add(c);
				}
			}
			ArrayList<Integer> max1 = new ArrayList<Integer>(sset.size());
			ArrayList<String> max_s = new ArrayList<String>(sset.size());
			String opt = "";
			for (String c : sset) {
				max1.add(Collections.frequency(ar1, c));
				max_s.add(c);
			}

			Integer imax1 = Collections.max(max1);
			for(int i=0; i<max_s.size(); i++) {
				opt = max_s.get(max1.indexOf(imax1));
			}
			System.out.print("Bigram "+opt);
			break;
		case 3:
			for (String sn : s) {
				sn = sn.replaceAll("[^a-z]", "");// [^a-zA-Z0-9]
				ArrayList<String> sarray = new ArrayList<String>();
				for(int i=0; i<sn.length()-2; i++) {
					sarray.add(sn.substring(i, i+3));
				}
				for (String c : sarray) {
					ar1.add(c);
					sset.add(c);
				}
			}
			ArrayList<Integer> max2 = new ArrayList<Integer>(sset.size());
			ArrayList<String> max_ss= new ArrayList<String>(sset.size());
			String opt1 = "";
			for (String c : sset) {
				max2.add(Collections.frequency(ar1, c));
				max_ss.add(c);
			}

			Integer imax2 = Collections.max(max2);
			for(int i=0; i<max_ss.size(); i++) {
				opt1 = max_ss.get(max2.indexOf(imax2));
			}
			System.out.print("Trigram "+opt1);
			break;

		default:
			break;
		}

	}
}