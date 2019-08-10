import java.util.Scanner;

public class toggleeachword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String st=new String();
		String op=new String();
		st=sc.nextLine();
		String sarr[]=st.split(" ");
		for(int i=0; i<sarr.length; i++) {
			String ss=sarr[i].substring(1);
			op+=sarr[i].charAt(0)+ss.toUpperCase()+" ";
		}
		System.out.println(op);

	}

}
