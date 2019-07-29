import java.util.ArrayList;
import java.util.Scanner;

public class intersect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int h = sc.nextInt();
		int inter = 0;
		ArrayList<Integer> vv = new ArrayList<>();
		ArrayList<Integer> hh = new ArrayList<>();
		for (int i = 0; i < v; i++) {
			if (vv.size() > 0) {
				int x = sc.nextInt();
				int y1 = sc.nextInt();
				int y2 = sc.nextInt();
				for (int j = 0; j < vv.size(); j = j + 3) {
					if (!vv.get(j).equals(x) || !vv.get(j + 1).equals(y1) || !vv.get(j + 2).equals(y2)) {
						vv.add(x);
						vv.add(y1);
						vv.add(y2);
					}
				}
			} else {
				vv.add(sc.nextInt());
				vv.add(sc.nextInt());
				vv.add(sc.nextInt());
			}
		}
		for (int i = 0; i < h; i++) {
			if (hh.size() > 0) {
				int y = sc.nextInt();
				int x1 = sc.nextInt();
				int x2 = sc.nextInt();
				for (int j = 0; j < hh.size(); j = j + 3) {
					if (!hh.get(j).equals(y) || !hh.get(j + 1).equals(x1) || !hh.get(j + 2).equals(x2)) {
						hh.add(y);
						hh.add(x1);
						hh.add(x2);
					}
				}
			} else {
				hh.add(sc.nextInt());
				hh.add(sc.nextInt());
				hh.add(sc.nextInt());
			}
		}
		System.out.println(vv);
		System.out.println(hh);

		for (int i = 0; i < vv.size(); i = i + 3) {
			int x = vv.get(i);
			int y1 = vv.get(i + 1);
			int y2 = vv.get(i + 2);

			for (int j = 0; j < hh.size(); j = j + 3) {
				int y = hh.get(j);
				int x1 = hh.get(j + 1);
				int x2 = hh.get(j + 2);
				if (x >= x1 && x <= x2 && y >= y1 && y <= y2) {
					inter++;
				}
			}
		}
		System.out.println(inter);
	}
}
