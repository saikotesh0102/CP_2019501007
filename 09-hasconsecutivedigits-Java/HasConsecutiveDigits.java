// hasConsecutiveDigits(n)  [10pts]
// Write the function hasConsecutiveDigits(n) that takes a possibly negative int value n and returns True if that 
// number contains two consecutive digits that are the same, and False otherwise.

public class HasConsecutiveDigits {
	public boolean hasConsecutiveDigits(int n) {
		// your code goes here
		String num = Integer.toString(Math.abs(n));
		for(int i = 0; i < num.length() - 1; i++){
			if(num.charAt(i) == num.charAt(i + 1)){
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
	}
}