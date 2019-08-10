
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.function.DoublePredicate;

public class stringprobs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st = new String();
		String op = new String();

		st = sc.nextLine();

		System.out.println("String Operations::");

		char ch = st.charAt(0);
		char ch1 = st.charAt(1);
		op = String.valueOf(ch) + String.valueOf(ch1);
		System.out.println(op);
		String stt = Character.toString(ch) + Character.toString(ch1);
		System.out.println(stt);
		stt += "jaja";
		System.out.println(stt);
		String ko = "kosha";
		System.out.println("LOOK:"+ko.matches("(.*)a"));

		DoublePredicate db = (x) -> {
			return x * x < 100.0;
		};

		StringBuilder sst = new StringBuilder("ko");
		System.out.println(sst.reverse());

		StringTokenizer d = new StringTokenizer("joker jokers", " ");
		while (d.hasMoreTokens()) {
			System.out.println(d.nextToken());
		}

		String kosha = new String("KOSHA");
		String revv = "";

		for (int j = kosha.length() - 1; j >= 0; j--) {
			revv = revv + kosha.charAt(j);
		}

		System.out.println(revv);

	}

}
