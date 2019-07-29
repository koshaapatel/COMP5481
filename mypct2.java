import java.util.ArrayList;
import java.util.Scanner;

public class mypct2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st = new String();
		String op = new String();
		ArrayList<String> ai = new ArrayList<>();
		ArrayList<Integer> mark = new ArrayList<>();
		int n = 0;
		n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			ai.add(i, sc.nextLine());
		}

		for (int i = 0; i < n; i++) {
			String ais = ai.get(i);
			op = "";
			mark.clear();
			for (int j = 0; j < ais.length() - 1; j++) {
				if (ais.charAt(j) == '/' && ais.charAt(j + 1) == '/') {
					op += ais.substring(j + 2, ais.length());
				} else if (ais.charAt(j) == '/' && ais.charAt(j + 1) == '*') {
					for (int k = j + 2; k < ais.length() - 1; k++) {
						if (ais.charAt(k) == '*' && ais.charAt(k + 1) == '/') {
							break;
						} else {
							op += ais.substring(k, k + 1);
						}
					}
					op += " ";
				} else if (ais.charAt(j) == '\"' && ais.charAt(j + 1) == '\'' && !mark.contains(j)) {
					mark.add(j);
					mark.add(j + 1);
					String temp = ais.substring(j + 1, ais.length());
					for (int k = j + 2; k <= ais.length() - 1; k++) {
						if (ais.charAt(k) == '\'' && ais.charAt(k + 1) == '\"') {
							mark.add(k);
							mark.add(k + 1);
							break;
						}
					}
					for (int k = 0; k <= temp.indexOf('\"'); k++) {
						if (temp.charAt(k) != '\"') {
							op += temp.substring(k, k + 1);
						}
					}
					op += " ";
				} else if (ais.charAt(j) == '\'' && !mark.contains(j)) {
					mark.add(j);
					String temp = ais.substring(j + 1, ais.length());
					for (int k = j + 1; k < ais.length(); k++) {
						if (ais.charAt(k) == '\'') {
							mark.add(k);
							break;
						}
					}
					for (int k = 0; k < temp.indexOf('\''); k++) {
						if (temp.charAt(k) != '\'') {
							op += temp.substring(k, k + 1);
						}
					}
					op += " ";
				}
			}
			System.out.println(op);
		}
	}
}
