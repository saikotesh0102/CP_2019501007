// # Without using iteration and without using strings, 
// # write the recursive function onlyEvenDigits(L), 
// # that takes a array L of non-negative integers 
// # (you may assume that), and returns a new array of 
// # the same numbers only without their odd digits 
// # (if that leaves no digits, then replace the number with 0). 
// # So: onlyEvenDigits([43, 23265, 17, 58344]) returns [4, 226, 0, 844]. 
// # Also the function returns the empty array if the original array is empty. 
// # Remember to not use strings. You may not use loops/iteration in this problem.

class recursion_onlyevendigits {
	public int[] fun_recursion_onlyevendigits(int[] l){
		int[] arr = {};
		if(l.length == 0){
			return arr;
		}
		return arr;
	}

	public boolean odd_even(int n){
		if(n % 2 == 0){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args) {
		
	}
}