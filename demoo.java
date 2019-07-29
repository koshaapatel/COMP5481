import java.util.Scanner;

public class demoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num, sum = 0;
		long temp = 0, b, r;
		long a[] = new long[20];
		
		String st = new String();
		num = sc.nextLong();
		// System.out.println(num);
		st = String.valueOf(num);

		for (int i = 0; i < st.length(); i++) {
			a[i] = num % 10;
			num = num / 10;
		}
		b = a[0]; //check digit
		if (a.length % 2 == 0) {
			for (int i = a.length - 1; i >= 0; i = i - 2) {
				long lp = a[i] * 2;
				a[i] = lp;
			}
		} else {
			for (int i = a.length - 2; i >= 0; i = i - 2) {
				long lp = a[i] * 2;
				a[i] = lp;
			}
		}

		if (a.length % 2 == 0) {
			for (int i = a.length - 1; i >= 0; i = i - 2) {
				for (int j = 0; j < 2; j++) {
					temp += a[i] % 10;
					a[i] = a[i] / 10;
				}
				a[i] = temp;
				temp = 0;
			}
		} else {
			for (int i = a.length - 2; i >= 0; i = i - 2) {
				for (int j = 0; j < 2; j++) {
					temp += a[i] % 10;
					a[i] = a[i] / 10;
				}
				a[i] = temp;
				temp = 0;
			}
		}

		for (int i = a.length - 1; i >= 0; i--) {
			sum += a[i];
		}

		if (sum % 10 == 0) {
			System.out.print("VALID");
		} else {
			// long q=sum%10;
			long q = sum - b;
			for (int i = 0; i <= 9; i++) {
				long jj = q + i;
				if (jj % 10 == 0) {
					System.out.print("INVALID" + " " + i);
				}
				jj = q - i;
			}
		}
	}
}