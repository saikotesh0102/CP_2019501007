// nthPowerfulNumber(n) [20 pts]
// Write the function nthPowerfulNumber(n). See here for details. So nthPowerfulNumber(0) returns 
// 1, and nthPowerfulNumber(10) returns 64.
// A number n is said to be Powerful Number if for every prime factor p of it, p2 also divides it. 
// For example:- 36 is a powerful number. It is divisible by both 3 and square of 3 i.e, 9.

public class NthPowerfulNumber {
	public long nthPowerfulNumber(int n) {
		// Your code goes here
		if(n == 0){
			return 1;
		}
		int start = 2;
		int count = 0;
		while(true){
			if(isPowerfulNumber(start)){
				System.out.println(start);
				count = count + 1;
				if(count == n){
					return start;
				}
			}
			start = start + 1;
		}
	}

	public boolean isPowerfulNumber(int n){
		while(n % 2 == 0){
			int power = 0;
			while(n % 2 == 0){
				n = n / 2;
				power = power + 1;
			}

			if(power == 1){
				return false;
			}
		}

		for(int i = 3; i < Math.sqrt(n); i = i + 2){
			int power = 0;
			while(n % i == 0){
				n = n / i;
				power = power + 1;
			}

			if(power == 1){
				return false;
			}
		}
		return n == 1;
	}
	
	public static void main(String[] args) {
		NthPowerfulNumber ob = new NthPowerfulNumber();
		System.out.println(ob.nthPowerfulNumber(10));
	}
}