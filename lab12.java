import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class lab12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n = sc.nextInt();
		int n1;
		int c=0;
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> ai = new ArrayList<ArrayList<Integer>>();
		// int f=0;
		int sum = 0;
		if (t < 1000 && n >= 1 && n <= 12) {
			for (int i = 0; i < n; i++) {
				n1 = sc.nextInt();
				if (n1 < 100) {
					num.add(n1);
				} else {
					// f=1;
					System.exit(0);
				}
			}
			
			for (int i = 0; i < num.size(); i++) {
				if (num.get(i) == t) {
					//ai.add(new ArrayList<Integer>());
					//ai.get(i).add(num.get(i));
					c++;
				} else {
					//ArrayList<Integer> marked = new ArrayList<Integer>();
					//marked.add(i);
					sum = num.get(i);
					for (int j = i + 1; j < num.size(); j++) {
						sum += num.get(j);
						if (sum == t) {
							c++;
							//ai.add(ai.size(),new ArrayList<Integer>() );
							//ai.add(new ArrayList<Integer>());
							//marked.add(j);
							//System.out.println(marked);
							/*
							 * for (int k = 0; k < marked.size(); k++) {
							 * ai.get(ai.size()).add(num.get(marked.get(k))); }
							 */
							break;
						} else if (sum > t) {
							sum -= num.get(j);
							continue;
						} else if (sum < t) {
							continue;
						}
					}
					sum = 0;
				}
			}
		}
		System.out.println(c);
	}
}
