// # Write the function fun_nth_additive_prime(n) that takes a non-negative int n 
// # and returns the nth Additive Prime, which is a prime number such that 
// # the sum of its digits is also prime. For example, 113 is prime and 1+1+3==5 and 5 
// # is also prime, so 113 is an Additive Prime. fun_nth_additive_prime(0) returns 2

public class nthtenlyprime {
	public int fun_nthtenlyprime(int n){
		if(n == 0){
			return 19;
		}
		int start = 20;
		int count = 0;
		while(true){
			if(isTenlyPrime(start)){
				count = count + 1;
				if(count == n){
					return start;
				}
			}
			start = start + 1;
		}
	}

	public boolean isTenlyPrime(int n){
		int sum = 0;
		int digit = n;
		while(n > 0){
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}

		if(sum == 10 && isPrime(digit)){
			return true;
		}
		return false;
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

	public static void main(String[] args){
		
	}
}