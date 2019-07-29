import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		String[] data = name.split(" ");
		//int flag = 0;
		if(data.length == 3) {
			System.out.println(data[2] + " " + data[0] + " "+data[1]);
		}
		
		else if(data.length == 2) { 
			String temp = data[1].toLowerCase();
			/*
			 * String lastString = data[1].toLowerCase(); char chr =
			 * lastString.charAt(lastString.length() - 1);
			 */
			
			if(temp.endsWith("a") || temp.endsWith("e") || temp.endsWith("i") || temp.endsWith("o") || temp.endsWith("u")) {
					System.out.println(data[1] + " " + data[0]);
				}
			 
			/*if(data[1].endsWith("a") || data[1].endsWith("e") || data[1].endsWith("i") || data[1].endsWith("o") || data[1].endsWith("u")
				||	data[1].endsWith("A") || data[1].endsWith("E") || data[1].endsWith("I") || data[1].endsWith("O") || data[1].endsWith("U")	
					) {
				System.out.println(data[1] + " " + data[0]);
			}*/
			else
				System.out.println(data[0] + " " + data[1]);

		}
		else
			System.out.println(data[0]);
	}
}



/*
 * String lastString = data[1].toLowerCase(); char chr =
 * lastString.charAt(lastString.length() - 1);
 * 
 * 
 * switch(chr) { case 'a': case 'e' : case 'i': case 'o': case 'u' : flag = 1
 * break;
 * 
 * } if(flag == 1) { System.out.println(data[1] + " " + data[0]); } else
 * System.out.println(data[0] + " " +data[1]);
 */

/*if(chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u') {
System.out.println(data[1] + " " + data[0]);
}*/