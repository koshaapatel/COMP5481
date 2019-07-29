import java.util.Scanner;

public class gameoflife {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		char arr[][] = new char[row][col];
		char temparr[][] = new char[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.next().charAt(0);
			}
		}
		int gen = sc.nextInt();

		while (gen > 0) {
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					temparr[i][j] = arr[i][j];
				}
			}
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					int count = 0;
					if (i - 1 > -1 && j - 1 > -1) { // 00 02 20
						if (temparr[i - 1][j - 1] == '@') {
							count++;
						}
					}
					if (i - 1 > -1 && j > -1) { // 00 02 j>-1
						if (temparr[i - 1][j] == '@') {
							count++;
						}
					}
					if (i - 1 > -1 && j + 1 < col) { // 00 02 22
						if (temparr[i - 1][j + 1] == '@') {
							count++;
						}
					}
					if (i > -1 && j - 1 > -1) { // 00 20 i>-1
						if (temparr[i][j - 1] == '@') {
							count++;
						}
					}
					if (i > -1 && j + 1 < col) { // 02 22
						if (temparr[i][j + 1] == '@') {
							count++;
						}
					}
					if (i + 1 < row && j - 1 > -1) { // 00 20 22
						if (temparr[i + 1][j - 1] == '@') {
							count++;
						}
					}
					if (i + 1 < row && j > -1) { // 20 22 j>0
						if (temparr[i + 1][j] == '@') {
							count++;
						}
					}
					if (i + 1 < row && j + 1 < col) { // 02 20 22
						if (temparr[i + 1][j + 1] == '@') {
							count++;
						}
					}
					if (temparr[i][j] == '@') {
						if (count == 0 || count == 1) {
							arr[i][j] = '#';
						}
						if (count == 2 || count == 3) {
							arr[i][j] = '@';
						}
						if (count == 4) {
							arr[i][j] = '#';
						}
					} else if (temparr[i][j] == '#') {
						if (count == 3) {
							arr[i][j] = '@';
						} else {
							arr[i][j] = '#';
						}
					}
				}
			}
			gen--;
		}
		int liveorg=0;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(arr[i][j]=='@') {
					liveorg++;
				}
			}
		}
		System.out.print(liveorg);
	}
}
