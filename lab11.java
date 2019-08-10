import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class lab11 {

	static Node root = null;

	static class Node {
		int d;
		Node l;
		Node r;

		Node(int d) {
			this.d = d;
			l = null;
			r = null;
		}
	};

	public static Node insert(Node n, int d) {
		if (n == null) {
			return new Node(d);
		} else {
			if (d > n.d) {
				n.l = insert(n.l, d);
			} else {
				n.r = insert(n.r, d);
			}
		}
		return n;
	}

	public static void levelorder(Node root, Queue<Node> q) {
		if (q.size() > 0) {
			Node nn = q.poll();
			System.out.print(nn.d+" ");
			if (nn.r != null) {
				q.add(nn.r);
			}
			if (nn.l != null) {
				q.add(nn.l);
			}
			levelorder(root, q);
		}

	}

	/*
	 * public static int perfbtree(Node curr) { if (curr == null) { return -1; }
	 * 
	 * int left = 1+perfbtree(curr.l); int right = 1+perfbtree(curr.r);
	 * 
	 * return Math.abs(left - right); }
	 */
static int jj=2;
static int mul=1;
static int f=0;
	public static int perfbtree(Node curr,Queue<Node> q) {
		/*
		 * if (curr == null) { return -1; }
		 */
		if (q.size() > 0) {
			for(int i=0; i<mul; i++) {
				Node nn = q.poll();
				if (nn.r != null) {
					q.add(nn.r);
				}
				if (nn.l != null) {
					q.add(nn.l);
				}
			}
			mul=mul*jj;
			if(q.size()==0) {
				//System.out.println("YES");
				return f;
			}
			if(q.size()!=mul) {
				//System.out.println("NOT");
				f=1;
				return f;
			}
			
			//System.out.println(nn.d);
			perfbtree(root, q);
		}
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> ai = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int k = sc.nextInt();
			ai.add(k);
		}

		for (int i = 0; i < ai.size(); i++) {
			root = insert(root, ai.get(i));
		}

		Queue<Node> q = new LinkedList<>();
		q.add(root);

		levelorder(root, q);
		q.add(root);
		int ff=perfbtree(root,q);
		if(ff==0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		

	}

}
