// # Write the function fun_nth_additive_prime(n) that takes a non-negative int n 
// # and returns the nth Additive Prime, which is a prime number such that 
// # the sum of its digits is also prime. For example, 113 is prime and 1+1+3==5 and 5 
// # is also prime, so 113 is an Additive Prime. fun_nth_additive_prime(0) returns 2

class nth_additive_prime {
	public int fun_nth_additive_prime(int n){
		if(n == 0){
			return 2;
		}
		while(true){
			int flag = 3;
			int count = 0;
			if(isPrime(flag) && isPrime(additive(flag))){
				count = count + 1;
				if(count == n){
					return flag;
				}
			}
			flag = flag + 2;
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
	
	public int additive(int n){
		int sum = 0;
		while(n > 0){
			sum = sum + n % 10;
			n = n / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		nth_additive_prime ob = new nth_additive_prime();
		System.out.println(ob.fun_nth_additive_prime(1));
	}
}