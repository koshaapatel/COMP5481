import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class lab4_1 {
	static Node r = null;
	static int flag=0;
	static class Node {
		int d;
		Node l;
		Node r;

		public Node(int d) {
			this.d = d;
			l = null;
			r = null;
		}
	};

	static Node addd(Node r, int s) {
		if (r == null) {
			return new Node(s);
		} else {
			if (s <= r.d) {
				r.l = addd(r.l, s);
			} else {
				r.r = addd(r.r, s);
			}
		}
		return r;
	}

	static void inorder(Node r) {
		if (r != null) {
			inorder(r.l);
			System.out.println(r.d + " ");
			inorder(r.r);
		}
	}

	static void preorder(Node r) {
		if (r != null) {
			System.out.print(r.d + " ");
			preorder(r.l);
			preorder(r.r);
		}
	}

	public static int height(Node d) {
		if (d == null) {
			return -1;
		}

		int left = 1 + height(d.l);
		int right = 1 + height(d.r);
		return Math.abs(left - right);

	}

	public static void BFS() {
		Queue<Node> q = new LinkedList<>();
		q.add(r);
		while (q.size() > 0) {
			Node n = q.poll();
			if (height(n) > 1) {
				flag = 1;
				System.out.println("NOT");
				break;
			} 
			// System.out.print(n.d + " ");
			if (n.l != null)
				q.add(n.l);
			if (n.r != null)
				q.add(n.r);
		}
		if(flag!=1) {
			preorder(r);
		}
		// preorder(r);
	};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		ArrayList<Integer> ai = new ArrayList<Integer>();	
		for (int j = 0; i != -1; j++) {
			i = sc.nextInt();
			ai.add(i);
		}
		ai.remove(ai.size() - 1);

		for (int k = 0; k < ai.size(); k++) {
			r = addd(r, ai.get(k).intValue());
		}

		// inorder(r);

		Queue<Node> q = new LinkedList<>();
		q.add(r);
		while (q.size() > 0) {
			Node n = q.poll();
			// System.out.print(n.d + " ");
			if (n.l != null)
				q.add(n.l);
			if (n.r != null)
				q.add(n.r);
		}
		BFS();
	}
}
