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
	public String fun_longestsubpalindromes(String str){
		if(str.length() == 1){
			return str;
		}
		String result = str.substring(0,1);
		for(int i = 0; i < str.length(); i++){
			String temp =  helper(str, i, i, str.length());
			if(temp.length() > result.length()){
				result = new String(temp);
			}

			if(temp.length() == result.length()){
				if(temp.compareTo(result) > 0){
					result = new String(temp);
				}
			}

			temp = helper(str, i, i + 1, str.length());
			if(temp.length() > result.length()){
				result = new String(temp);
			}
		}
		return result;
	}

	public String helper(String str, int begin, int end, int n){
		while(begin >= 0 && end <= n -1 && str.charAt(begin) == str.charAt(end)){
			begin = begin - 1;
			end = end + 1;
		}
		return str.substring(begin + 1, end);
	}

	public static void main(String[] args) {
		
	}
}
