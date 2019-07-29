import java.util.ArrayList;
import java.util.Scanner;

public class mypct2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st = new String();
		String op = new String();
		ArrayList<String> ai = new ArrayList<>();
		//ArrayList<Integer> mark = new ArrayList<>();
		int n = 0;
		n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			ai.add(i, sc.nextLine());
		}
		for (int i = 0; i < n; i++) {
			String ais = ai.get(i);
			op = "";
			for (int j = 0; j < ais.length() - 1; j++) {
				 if(ais.charAt(j)=='/' && ais.charAt(j+1)=='/') {
					 int k=j+2;
					 while(k<ais.length()) {
						 op+=ais.charAt(k);
						 k++;
					 }
				 }
				 else if(ais.charAt(j)=='\'') {
					 int k=j+1;
					 while(ais.charAt(k)!='\'') {
						 op+=ais.charAt(k);
						 k++;
					 }
					 j=k;
					 op+=" ";
				 }
				 else if(ais.charAt(j)=='\"') {
					 int k=j+1;
					 while(ais.charAt(k)!='\"') {
						 op+=ais.charAt(k);
						 k++;
					 }
					 j=k;
					 op+=" ";
				 }

				 else if(ais.charAt(j)=='\"' && ais.charAt(j+1)=='\'') {
					 op+=ais.charAt(j+1);
					 int k=j+2;
					 while(ais.charAt(k)!='\"') {
						 op+=ais.charAt(k);
						 k++;
					 }
					 j=k;
					 op+=" ";
				 }
				 else if(ais.charAt(j)=='/' && ais.charAt(j+1)=='*') {
					 int k=j+2;
					 while(ais.charAt(k)!='*' && ais.charAt(k+1)!='/') {
						 op+=ais.charAt(k);
						 k++;
					 }
					 //op+=ais.charAt(k);
					 j=k;
					 op+=" ";
				 }
				
			}
			System.out.println(op);
		}
	}
}
