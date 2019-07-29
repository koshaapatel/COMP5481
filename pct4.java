import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class pct4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int res = sc.nextInt();
		int count = res;
		int build = sc.nextInt();
		int opi = sc.nextInt();
		int opient[][] = new int[opi][2];
		HashMap<Integer, HashSet<Integer>> hm = new HashMap<>();
		HashSet<ArrayList<Integer>> set = new HashSet<>();
		HashSet<HashSet<Integer>> stt = new HashSet<>();
		for (int i = 0; i < opi; i++) {
			for (int j = 0; j < 2; j++) {
				opient[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < opi; i++) {
			for (int j = 0; j < 1; j++) {
				if (!hm.containsKey(opient[i][j])) {
					hm.put(opient[i][j], new HashSet<>());
					hm.get(opient[i][j]).add(opient[i][1]);
					count--;
				} else {
					hm.get(opient[i][j]).add(opient[i][1]);
				}
			}
		}
		System.out.println("hm" + hm);
		for (Map.Entry<Integer, HashSet<Integer>> hmd : hm.entrySet()) {
			HashSet<Integer> hss = hmd.getValue();
			ArrayList<Integer> ai = new ArrayList<>(hss);
			Collections.sort(ai);
			HashSet<Integer> val = new HashSet<>(ai);
			System.out.println("val" + val);
			if (!stt.contains(ai)) {
				stt.add(new HashSet<>(ai));
			}
			/*
			 * if(!set.contains(val)) { set.add(new ArrayList<>(val)); }
			 */
		}
		// System.out.println(set);
		System.out.println(stt);
		System.out.println("count" + count);
		int kay = 0;
		if (count == 0) {
			System.out.println("answer" + stt.size()); // set.size()
		} else if (count >= 1) {
			count = 1;
			kay = count + stt.size(); // set.size()
			System.out.println("answer" + kay);
		} else {
			System.out.println(kay);
		}
	}
}
