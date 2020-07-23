// longestCommonSubstring(s1, s2)[20 pts]
// Write the function, longestCommonSubstring(s1, s2), that takes two possibly-empty strings and returns the longest 
// string that occurs in both strings (and returns the empty string if either string is empty). For example:
// longestCommonSubstring("abcdef", "abqrcdest") returns "cde"
// longestCommonSubstring("abcdef", "ghi") returns "" (the empty string)
// If there are two or more longest common substrings, return the lexicographically smaller one (ie, just use "<" to 
// compare the strings). So, for example:
// longestCommonSubstring("abcABC", "zzabZZAB") returns "AB" and not "ab"

import java.util.*;

public class LongestCommonSubString {
	public String longestCommonSubstring(String s1, String s2) {
		// Your code goes here
		int[][] arr = new int[s1.length() + 1][s2.length() + 1];
		int len = 0, row = 0, col = 0;

		for(int i = 0; i <= s1.length(); i++){
			for(int j = 0; j <= s2.length(); j++){
				if(i == 0 || j == 0){
					arr[i][j] = 0;
				}else if(s1.charAt(i - 1) == s2.charAt(j - 1)){
					arr[i][j] = arr[i - 1][j - 1] + 1;
					if(len < arr[i][j]){
						len = arr[i][j];
						row = i;
						col = j;
					}
				}else{
					arr[i][j] = 0;
				}
			}
		}

		if(len == 0){
			return "";
		}

		String resultStr = "";
		while(arr[row][col] != 0){
			resultStr = resultStr + s1.charAt(row - 1);
			len = len - 1;
			row = row - 1;
			col = col - 1;
		}
		// return new String(Arrays.sort(resultStr.toCharArray()));
		char[] temp = resultStr.toCharArray();
		Arrays.sort(temp);
		return new String(temp);
	}

	public static void main(String[] args) {
		
	}
}