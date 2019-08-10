import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class snakesladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int j = sc.nextInt();
			int k = sc.nextInt();
			hm.put(j, k);
		}
		System.out.println("hm" + hm);
		int moves = sc.nextInt();
		ArrayList<Integer> ai = new ArrayList<Integer>();
		ArrayList<Integer> bi = new ArrayList<Integer>();
		for (int i = 0; i < moves / 2; i++) {
			int j = sc.nextInt();
			int k = sc.nextInt();
			ai.add(j);
			bi.add(k);
		}
		System.out.println("ai:" + ai);
		System.out.println("bi:" + bi);
		int kk = 1;
		int sum = 0;
		for (int i = 0; i < ai.size(); i++) {
			sum += kk + ai.get(i);
			while (hm.containsKey(sum)) {
				int val = hm.get(sum);
				sum = val;
			}
			kk = 0;
		}

		int sum1 = 0;
		int kp = 1;
		for (int i = 0; i < bi.size(); i++) {
			sum1 += kp + bi.get(i);
			while (hm.containsKey(sum1)) {
				int val = hm.get(sum1);
				sum1 = val;
			}
			kp = 0;
		}

		if (sum1 > sum) {
			System.out.println("B" + " " + sum1);
		} else {
			System.out.println("A" + " " + sum1);
		}
	}

}
