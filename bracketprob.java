import java.util.Scanner;
import java.util.Stack;

public class bracketprob {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st = new String();
		Stack<Character> stack = new Stack<Character>();
		st = sc.nextLine();
		char ch[] = st.toCharArray();
		int flag = 0;
		for (int i = 0; i < ch.length; i++) {
			if (flag != 1) {
				if (ch[i] == '(' || ch[i] == '{' || ch[i] == '[') {
					stack.push(ch[i]);
				} else if (!stack.isEmpty() && ch[i] == ')' || ch[i] == '}' || ch[i] == ']') {

					if (stack.peek() == '(' && ch[i] == ')') {
						stack.pop();
					
					} else if (stack.peek() == '{' && ch[i] == '}') {
						stack.pop();
						
					} else if (stack.peek() == '[' && ch[i] == ']') {
						stack.pop();
					}
					else {

					if (stack.peek() == '(' && ch[i] == '}' || ch[i] == ']') {
						flag = 1;
						break;
					}
					if (stack.peek() == '{' && ch[i] == ')' || ch[i] == ']') {
						flag = 1;
						break;
					}
					if (stack.peek() == '[' && ch[i] == '}' || ch[i] == ')') {
						flag = 1;
						break;
					}
					}
				}
			}
		}
		if (flag == 1 && !stack.isEmpty()) {
			System.out.println("invalid");
		}
		if (stack.isEmpty()) {
			System.out.println("valid");
		}
	}
}
