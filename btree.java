import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class btree {
	static Node r = null;

	static class Node {
		char d;
		Node l;
		Node r;

		public Node(char d) {
			this.d = d;
			l = null;
			r = null;
		}
	};

	static Node addd(Node r, char s) {
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
			if (r.d == '$') {
			} else {
				System.out.println(r.d + " ");
			}
			inorder(r.r);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Character> stack = new Stack<Character>();
		String st = new String();
		String ss = scan.nextLine();
		st = ss.replaceAll(" ", "");
		System.out.println(st);
		ArrayList<Character> sarr = new ArrayList<Character>(st.length());
		char[] ch = st.toCharArray();
		int j = 0;
		for (char c : ch) {
			sarr.add(j, c);
			j++;
		}

		for (int i = 0; i < sarr.size() - 1; i++) {
			if (sarr.get(i) == '(') {
				if (sarr.get(i) == '(' && sarr.get(i + 1) == ')') {
					r = addd(r, '$');
				} else {
					stack.push(sarr.get(i));
					stack.push(sarr.get(i + 1));
					r = addd(r, sarr.get(i + 1));
				}
			}
			if (sarr.get(i) == ')') {
				if (sarr.get(i) == ')' && sarr.get(i - 1) == '(') {

				} else {
					stack.pop();
					while (stack.peek() == '(') {
						stack.pop();
					}
				}
			}
		}

		// inorder(r);

		Queue<Node> q = new LinkedList<>();
		q.add(r);
		while (q.size() > 0) {
			Node n = q.poll();
			if (n.d == '$') {
			} else {
				System.out.print(n.d + " ");
			}
			if (n.l != null)
				q.add(n.l);
			if (n.r != null)
				q.add(n.r);
		}
	}
}
