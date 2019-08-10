import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class lab10 {
	static ArrayList<String> op=new ArrayList<String>();
	static Queue<Integer> q=new LinkedList<>();
	static HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
	static ArrayList<Integer> sam = new ArrayList<>();
	
	public static void BFS(Queue<Integer> q,int j, int k) {
		q.clear();
		int f=0;
		if(j==k) {
			f=1;
		}
		else {
			q.add(j);
			while(q.size()>0) {
				if(hm.containsKey(q.peek())) {
					if(hm.get(q.peek()).contains(k)) {
						f=1;
						break;
					}
					else {
						ArrayList<Integer> hh=hm.get(q.peek()); 
						for(int i=0; i<hh.size(); i++) {
							q.add(hh.get(i));
						}
						q.poll();
					}
				}
				else {
					q.poll();
				}
			}
		}
	
		if(f==0) {
			op.add("NO");
		}
		else {
			op.add("YES");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int vert, edge;
		
		vert = sc.nextInt();
		edge = sc.nextInt();
		for (int i = 0; i < edge; i++) {
			int j = sc.nextInt();
			int k = sc.nextInt();
			if (hm.containsKey(j)) {
				hm.get(j).add(k);
			} else {
				hm.put(j, new ArrayList<>());
				hm.get(j).add(k);
			}
		}

		int s = sc.nextInt();
		
		for (int i = 0; i < s; i++) {
			int j = sc.nextInt();
			int k = sc.nextInt();
			sam.add(j);
			sam.add(k);
		}
		
		for(int i=0; i<sam.size(); i=i+2) {
			int j=sam.get(i);
			int k=sam.get(i+1);
			BFS(q,j,k);
		}
		
		System.out.println(op);

	}

}
