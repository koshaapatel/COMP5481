import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class uniquewords {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> ar = new ArrayList<String>();
		String input = sc.nextLine(); // P p q r
		input = input.toLowerCase(); // p p q r
		String[] input1 = input.split(" ");

		Set<String> hash_Set = new HashSet<String>();

		for (int i = 0; i < input1.length; i++) {
			hash_Set.add(input1[i]);
		}
		System.out.print(hash_Set.size());
		//System.out.println(hash_Set);

		ArrayList<String> sar = new ArrayList<String>(hash_Set);
		for (String s : sar) {
			System.out.println(s);
		}

		/*
		 * for (int i = 0; i < input1.length; i++) { if (!ar.contains(input1[i])) {
		 * ar.add(input1[i]); } } System.out.print(ar.size());
		 */
	}

}
