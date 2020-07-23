// sameChars(s1, s2) [20 pts]
// Write the function sameChars(s1, s2) that takes two strings and returns True if the two strings are composed of 
// the same characters (though perhaps in different numbers and in different orders) -- that is, if every character 
// that is in the first string, is in the second, and vice versa -- and False otherwise. This test is 
// case-sensitive, so "ABC" and "abc" do not contain the same characters. The function returns False if either 
// parameter is not a string, but returns True if both strings are empty (why?).

public class SameChars {
	public boolean sameChars(String s1, String s2) {
		// Your code goes here
		if(s1.equals(s2)){
			return true;
		}
		int count = 0;
		for(int i = 0; i < s2.length(); i++){
			if(s1.contains(s2.charAt(i))){
				count = count + 1;
			}
		}

		if(s2.length() == count){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
	}
}