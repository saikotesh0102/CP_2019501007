// nthPronicNumber(n) [20 pts]
// Write the function nthPronicNumber that takes a non-negative int n and returns the nth Pronic 
// Number. Pronic number is a number which is the product of two consecutive integers, that is, a 
// number n is a product of x and (x+1).

public class NthPronicNumber {
	public long nthPronicNumber(int n) {
		// Your code goes here
		if(n == 0){
			return 0;
		}
		int start = 2;
		int count = 0;
		while(true){
			if(isPronic(start)){
				count = count + 1;
				if(count == n){
					return start;
				}
			}
			start = start + 1;
		}
	}

	public boolean isPronic(int n){
		for(int i = 0; i <= (int)Math.sqrt(n); i++){
			if(n == i * (i + 1)){
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
	}
}