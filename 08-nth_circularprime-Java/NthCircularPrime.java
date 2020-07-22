// nthCircularPrime(n) [20 pts]
// Write the function nthCircularPrime that takes a non-negative int n and returns the nth 
// Circular prime, which is a prime number that does not contain any 0's and such that all the 
// numbers resulting from rotating its digits are also prime. The first Circular primes are 2, 3, 
// 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, 97, 113, 131, 197... To see why 197 is a Circular prime, 
// note that 197 is prime, as is 971 (rotated left), as is 719 (rotated left again).

public class NthCircularPrime {
	public long nthCircularPrime(int n) {
		// your code goes here
		if(n == 0){
			return 2;
		}	
		int start = 3;
		int count = 0;
		while(true){
			if(isCircularPrime(start) && isPrime(start)){
				count = count + 1;
				if(count == n){
					return start;
				}
			}
			start = start + 2;
		}
	}

	public boolean isPrime(int n) { 
        if (n <= 1){
			return false;
		}
   
        for (int i = 2; i < n; i++){
            if (n % i == 0){
				return false;
			}
		}
        return true; 
	}
	
	public boolean isCircularPrime(int n){
		int count = 0;
		int temp = n;

		while(temp > 0){
			count = count + 1;
			temp = temp / 10;
		}

		int num = n;
		while(isPrime(num)){
			int rem = num % 10;
			int div = num / 10;

			num = (int)((Math.pow(10, count - 1) * rem) + div);

			if(num == n){
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
	}
}
