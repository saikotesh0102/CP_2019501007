import java.util.*;

// removeDuplicate(text) [10 pts]
// Write a program to remove all the duplicate characters from a given input String,e.g.
// if given String is "JavaPython" then the output should be "JavPython".
// The second or further occurrence of duplicate should be removed.

public class RemoveDuplicate {
	public String removeDuplicate(String text) {
		// Your code goes here
		char[] chars = text.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
			charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
			sb.append(character);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		
	}
}