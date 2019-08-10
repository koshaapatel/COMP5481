import java.util.Scanner;

public class reverseeachword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String st=new String();
		String op=new String();
		op="";
		st=sc.nextLine();
		
		String sarr[]=st.split(" ");
		for(int i=0; i<sarr.length; i++) {
			StringBuilder sb=new StringBuilder(sarr[i]);
			sb.reverse();
			op+=sb+" ";
		}
		
		System.out.println(op.trim());

	}

}
