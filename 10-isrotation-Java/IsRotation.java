// isRotation(x, y) [15 pts]
// Write the function isRotation(x, y) that takes two non-negative integers x and y, both 
// guaranteed to not contain any 0's, and 
// returns True if x is a rotation of the digits of y and False otherwise. For example, 
// 3412 is a rotation of 1234. Any number 
// is a rotation of itself.

public class IsRotation {
	public boolean isRotation(int x, int y) {
		// Your code goes here
		String str1 = Integer.toString(x);
		String str2 = Integer.toString(y);
		return (str1.length() == str2.length()) && ((str1 + str1).contains(str2));
	}
}