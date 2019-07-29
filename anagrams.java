import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1=sc.next();
		char ch[]=s.toCharArray();
		int chc[]=new int[ch.length];
		int sum=0;
		ArrayList<Integer> marked=new ArrayList<>();
		Arrays.fill(chc, 1);
		for(int i=0;i<ch.length;i++) {
			char chh=s.charAt(i);
			for(int j=0; j<s1.length(); j++) {
				if(s1.charAt(j)==chh && !marked.contains(j)) {
					chc[i]=0;
					marked.add(j);
					break;
				}
			}
		}
		
		for(int i=0;i<chc.length;i++) {
			sum=sum+chc[i];
		}
		if(sum==0) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not anagram");
		}
		
	}

}
