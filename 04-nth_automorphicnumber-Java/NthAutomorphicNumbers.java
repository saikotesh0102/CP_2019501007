// nthAutomorphicNumbers(n) [20 pts]
// In mathematics, an automorphic number is a number whose square "ends" in the same digits as the 
// number itself. For example, 5^2 = 25, 6^2 = 36, 76^2 = 5776, and 890625^2 = 793212890625, so 5, 6, 
// 76 and 890625 are all automorphic numbers.

public class NthAutomorphicNumbers {
	public long nthAutomorphicNumbers(int n) {
		// Your code goes here
		if(n == 1){
			return 0;
		}
		long start = 1;
		int count = 1;
		while(true){
			if(isAutomorphic(start)){
				count = count + 1;
				if(count == n){
					return start;
				}
			}
			start = start + 1;
		}
	}

	public boolean isAutomorphic(long n){
		long sq = n * n;
		while(n > 0){
			if(n % 10 != sq % 10){
				return false;
			}
			n = n / 10;
			sq = sq / 10;
		}
		return true;
	}

	public static void main(String[] args) {
		
	}
}