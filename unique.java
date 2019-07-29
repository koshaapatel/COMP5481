import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//jem unique
	Scanner sc= new Scanner(System.in);
	String s=sc.nextLine();
	String s2 =s.toLowerCase();
	String s1[] = s2.split(" ");
	ArrayList<String> n = new ArrayList<>(Arrays.asList(s1));
		/*
		 * for(String h:n) { System.out.println(h); }
		 */
	for(int i=0;i<n.size();i++)
	{
		for(int j=0;j<n.size();j++)
		{
			
			if((n.get(i)).equals(n.get(j)) && i!=j)
			{
				n.remove(j);
			}
		}
	}
	System.out.println(n);
	
	
//	ArrayList<String> n = new ArrayList<>(Arrays.asList(s1));
//	System.out.println(n);
//	Set<String> st= new HashSet<>(Arrays.asList(s1));
//	System.out.println(st);
//	System.out.println(st.size());
	}

}
