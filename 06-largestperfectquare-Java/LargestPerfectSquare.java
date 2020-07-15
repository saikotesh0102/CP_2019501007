// largestPerfectSquare(n) [10 pts]
// Write the function largestPerfectSquare(n) that takes a non-negative int n, and returns  the largest perfect
// square that is no larger than n. For example:
// assert(largestPerfectSquare(24) == 16)
// assert(largestPerfectSquare(25) == 25)
// assert(largestPerfectSquare(26) == 25)
// Hint: you may wish to use a similar approach to how you solved isPerfectSquare on the hw.
// Another hint: This can be written using just one or two lines of Python.

public class LargestPerfectSquare {
	public int largestPerfectSquare(int n) {
		// Your code goes here
		int i;
		for(i = n; i >= 1; i--){
			if((int)Math.sqrt(i) * (int)Math.sqrt(i) == i){
				break;
			}
		}
		return i;
	}

	public static void main(String[] args) {
		
	}
}