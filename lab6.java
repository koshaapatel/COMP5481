import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class lab6 {
	static HashMap<Integer, HashSet<Integer>> hm = new HashMap<>();
	static HashSet<Integer> unique = new HashSet<Integer>();
	static Queue<Integer> q = new LinkedList<>();
	static int vert = 0, edges = 0, count = 0;
	static ArrayList<Integer> con = new ArrayList<>();
	static ArrayList<Integer> checked = new ArrayList<>();

	public static void components(HashMap<Integer, HashSet<Integer>> hmd) {
		for (Map.Entry<Integer, HashSet<Integer>> mm : hmd.entrySet()) {
			int key = mm.getKey();
			if (!checked.contains(key)) {
				checked.add(key);
				count++;
				BFS(key);
			}
			// q.add(key);
		}
	}

	public static void BFS(int key) {
		q.addAll(hm.get(key)); // 2 3
		while (q.size() > 0) {
			if (hm.containsKey(q.peek()) && !checked.contains(q.peek())) {
				q.addAll(hm.get(q.peek())); // 2 3
				checked.add(q.poll());
			} else {
				checked.add(q.poll());
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		vert = sc.nextInt();
		edges = sc.nextInt();
		for (int i = 0; i < edges; i++) {
			con.add(0, sc.nextInt());
			con.add(1, sc.nextInt());
			unique.add(con.get(0));
			unique.add(con.get(1));
			if (hm.containsKey(con.get(0))) {
				hm.get(con.get(0)).add(con.get(1));
			} else {
				hm.put(con.get(0), new HashSet<Integer>());
				hm.get(con.get(0)).add(con.get(1));
			}
		}

		components(hm);
		System.out.println(unique.size());
		System.out.println(count);
		if (unique.size() < vert) {
			if (unique.contains(vert)) {
				if(unique.size()<=2) {
					int a = vert - unique.size();
					count = count + a;
				}
			} else {
				int a = vert - unique.size();
				count = count + a;
			}
		}

		if (count > 1) {
			System.out.println("0" + " " + count);
		} else {
			System.out.println("1" + " " + count);
		}
		System.out.println(hm);
	}

}
