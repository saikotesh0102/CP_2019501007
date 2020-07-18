// First, you can read about look-and-say numbers here. Then, write the function lookAndSay(a) that takes a list of 
// numbers and returns a list of numbers that results from "reading off" the initial list using the look-and-say 
// method, using tuples for each (count, value) pair. For example:
// lookAndSay([]) == []
// lookAndSay([1,1,1]) == [(3,1)]
// lookAndSay([-1,2,7]) == [(1,-1),(1,2),(1,7)]
// lookAndSay([3,3,8,-10,-10,-10]) == [(2,3),(1,8),(3,-10)]
// lookAndSay([3,3,8,3,3,3,3]) == [(2,3),(1,8),(4,3)]

import java.util.*;

public class LookAndSay {
	public String lookAndSay(int[] a) {
		// Your code goes here
		String str = "";
		if(a.length == 0){
			return str;
		}

		boolean[] visited = new boolean[a.length];
		Arrays.fill(visited, false);

		for(int i = 0; i < a.length; i++) {
			if(visited[i] == true){
				continue;
			}

			int count = 1;

			for (int j = i + 1; j < a.length; j++) { 
				if (a[i] == a[j]) { 
					visited[j] = true; 
					count++; 
				} 
			}
			str = str + "(" + count + ", " + a[i] + ")";
		}
		return str;
	}

	public static void main(String[] args) {
		
	}
}