import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String st=new String();
		st=sc.nextLine();
		st=st.toLowerCase();
		char ch[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		//ArrayList<Integer> ai=new ArrayList<>();
		int a[]=new int[26];
		int c=0;
		int f=0;
		//Arrays.fill(a, 1);
		for(int i=0;i<ch.length; i++) {
			f=0;
			for(int j=0; j<st.length(); j++ ) {
				if(st.charAt(j)!=ch[i]) {
					continue;
				}
				else {
					c++;
					f=1;
					break;
				}
			}
			if(f!=1) {
				break;
			}
		}
		/*
		 * for(char i='a';i<='z';i++) { for(int j=0; j<st.length(); j++ ) {
		 * if(st.charAt(j)==i) { c++; } } }
		 */

		System.out.println(c);
		if(c<26 && f!=1) {
			System.out.println("not pangram");
		}
		else  {
			System.out.println("pangram");
		}
			

	}

}
