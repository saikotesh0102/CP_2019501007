// # Write the function longestSubpalindrome(s), that takes a string s and returns 
// the longest palindrome that occurs as consecutive characters (not just letters, but 
// 	any characters) in s. So:
// #    	longestSubpalindrome("ab-4-be!!!") 
// # returns "b-4-b". If there is a tie, return the lexicographically larger value -- 
// in java, a string s1 is lexicographically greater than a string s2 if (s1 > s2). So:
// #    	longestSubpalindrome("abcbce") 
// # returns "cbc", since ("cbc" > "bcb"). Note that unlike the previous functions, 
// this function is case-sensitive (so "A" is not treated the same as "a" here). Also, 
// from the explanation above, we see that longestSubpalindrome("aba") is "aba", 
// and longestSubpalindrome("a") is "a".

public class longestsubpalindromes {
	public String fun_longestsubpalindromes(String s){
		boolean[][] arr = new boolean[s.length()][s.length()];

		for(int i = 0; i < s.length(); i++){
			arr[i][i] = true;
		}

		int length = 1;
		int start = 0;

		for(int i = 2; i < s.length() + 1; i++){
			for(int j = 0; j < s.length() - i + 1; j++){
				int end = j + 1;
				if (i == 2){
					if(s.charAt(j) == s.charAt(end - 1)){
						arr[j][end - 1] = true;
						length = i;
						start = j;
					}
				}else{
					if(s.charAt(j) == s.charAt(end - 1) && arr[j + 1][end - 2]){
						arr[j][end - 1] = true;
						length = i;
						start = j;
					}
				}
			}
		}
		return s.substring(start, start + length);
	}

	public static void main(String[] args) {
		
	}
}
