import java.util.ArrayList;
import java.util.Scanner;

public class jem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<ArrayList<Integer>> ai=new ArrayList<>();
		int row=sc.nextInt();
		for(int i=0; i<row; i++) {
			int t=sc.nextInt();
			ai.add(new ArrayList<Integer>());
			ai.get(i).add(t);
			for(int j=1;j<=t;j++) {
				int t1=sc.nextInt();
				ai.get(i).add(t1);
			}
		}
		for(int i=0; i<row; i++) {
			for(int j=0;j<ai.get(i).size();j++) {
				System.out.print(ai.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
	}

}
