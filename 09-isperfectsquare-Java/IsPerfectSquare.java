// isPerfectSquare(n)
// Write the function isPerfectSquare(n) that takes a possibly-non-int value, and returns True if
// it is an int that is a perfect square (that is, if there exists an integer m such that
// m**2 == n), and False otherwise. Do not crash on non-ints nor on negative ints.

public class IsPerfectSquare {
	public boolean isPerfectSquare(int n) {
		// Your code goes here
		if(n >= 0){
			for(int i = 0; i <= n/2; i++){
				if(i * i == n){
					return true;
				}
			}
			return false;
		}else{
			return false;
		}
	}

	public static void main(String[] args) {
		
	}
}