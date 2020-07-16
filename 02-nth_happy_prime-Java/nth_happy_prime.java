// # A happy prime is a number that is both happy and prime. 
// # Write the function nthHappyPrime(n) which takes a non-negative integer 
// # and returns the nth happy prime number (where the 0th happy prime number is 7).


class nth_happy_prime {
	public int fun_nth_happy_prime(int n){
		// your code goes here
		if(n == 0){
			return 7;
		}	
		int start = 2;
		int count = 0;
		while(true){
			if(isHappyNumber(start) && isPrime(start)){
				count = count + 1;
				if(count == n){
					return start;
				}
			}
			start = start + 1;
		}
	}

	public boolean isPrime(int n) { 
        // Corner case 
        if (n <= 1) 
            return false; 
  
        // Check from 2 to n-1 
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
        return true; 
    }

	public boolean isHappyNumber(int n) {
		// your code goes here
		int num = Math.abs(n);
		if(num == 1){
			return true;
		}
		int sum = num; 
		int x = num;

		while(sum > 9){
			sum = 0;
			while(x > 0){
				int d = x % 10;
				sum = sum + d * d;
				x = x / 10;
			}
			if(sum == 1){
				return true;
			}
			x = sum;
		}
		return false;
	}

	public static void main(String[] args) {
		
	}
}