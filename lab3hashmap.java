import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class lab3hashmap {
	static ArrayList<Character> haha = new ArrayList<>();
	static ArrayList<Character> visited = new ArrayList<>();
	static Queue<Character> q = new LinkedList<>();
	static int n;
	static char x;
	static HashMap<Character, ArrayList<Character>> hm = new HashMap<>();
	static int count = n;

	static void DFS(char z) {
		
		for(Character key:hm.keySet()) {
			if(!visited.contains(key)) {
				count=n;
				q.addAll(hm.get(key));
				visited.add(key);
			}
			
			if(q.size()>0 && !visited.contains(key)) {
				count--;
				if(count==0) {
					haha.add(q.peek());
				}
				DFS(q.poll());
			}
		}
 	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> st = new Stack<>();
		Scanner sc = new Scanner(System.in);
		String str = new String();
		String op = new String();

		str = sc.nextLine();
		str = str.replaceAll(" ", "");
		char car[] = str.toCharArray();
		x = sc.next().charAt(0);
		n = sc.nextInt();

		for (int i = 0; i < car.length; i++) {
			if (car[i] != ')') {
				st.push(car[i]);
			} else {
				if (!st.isEmpty()) {
					char temp = st.pop();
					if (!st.isEmpty()) {
						if (st.peek() == '(') {
							st.pop();
							if (!st.isEmpty()) {
								char a = st.peek();
								if (hm.containsKey(a)) {
									hm.get(a).add(temp);
								} else {
									hm.put(a, new ArrayList<Character>());
									hm.get(a).add(temp);
								}
							}
						}
					}
				}
			}
		}
		System.out.println(hm);
		DFS(x);
		for (Character r : haha) {
			System.out.println("&" + r);
		}
	}
}

//Iterator it = hm.entrySet().iterator();
/*
 * for (Map.Entry<Character, ArrayList<Character>> entry : hm.entrySet()) {
 * Character chq = entry.getKey(); if(hm.get(chq).contains(x)) { n--;
 * ArrayList<Character> check = new ArrayList<>(); check.add(chq);
 * check.add(hm.get(chq).get(0)); for(Character xx: check) {
 * 
 * } } }
 */

/*
 * static void DFS(char key) { ArrayList<Character> dfsc = new ArrayList<>();
 * 
 * for (Map.Entry<Character, ArrayList<Character>> asd : hm.entrySet()) {
 * Character ckey = asd.getKey(); ArrayList<Character> asdi = asd.getValue();
 * 
 * if (ckey == key) { for (Character asc : asdi) { if (asc != x) { q.poll();
 * count--; q.add(asc); if (count == 0) { haha.add(asc); q.poll(); break; } else
 * { DFS(asc); } } } } else { break; } } }
 */

/*
 * else { for (Character hmm : hm.keySet()) { if (hm.get(hmm).contains(x)) {
 * thekey = hmm; // e count--; // q.add(thekey); // e DFS(thekey); break; } } //
 * while (count != 0) { for (Character hmmd : hm.keySet()) { if
 * (hm.get(hmmd).contains(thekey)) { thekey = hmmd; count--; // q.add(thekey);
 * DFS(thekey); } } }
 */

/*
 * public static void DFSS(char ch, ArrayList<Character> bool) { // bool=new
 * ArrayList<Character>(); bool.add(ch); // bool.get(ch)=true; if
 * (hm.containsKey(ch)) { ArrayList<Character> temp = hm.get(ch); for (char i :
 * temp) { if (!bool.contains(i)) { count--; if(count==0) { haha.add(i); }
 * DFSS(i, bool); } } } }
 * 
 * static void DFS(char key) { ArrayList<Character> visited = new ArrayList<>();
 * // boolean[] visited = new boolean[v+1]; for (Map.Entry<Character,
 * ArrayList<Character>> map : hm.entrySet()) { char keyy = map.getKey();
 * ArrayList<Character> temp = map.getValue(); if (!visited.contains(keyy)) {
 * count--; DFSS(keyy, visited); } } }
 */