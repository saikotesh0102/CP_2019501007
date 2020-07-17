// # Write the function fun_nth_palindromic_prime(n) that takes a non-negative int n 
// # and returns the nth palindromic Prime, which is a palidrome number such that 
// # it is also a prime. For example, 313 is a palindrome and it is prime 
// # so 313 is an palindrome Prime. fun_nth_palindrome_prime(0) returns 2


class nth_palindromic_prime {
	public int fun_nth_palindromic_prime(int n){
		if(n == 0){
			return 2;
		}

		int flag = 3;
		int count = 0;
		while(true){
			if(isPrime(flag) && isPalindrome(flag)){
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

	public boolean isPalindrome(int n){
		int reverse = 0;
		int digit = n;

		while(n != 0){
			reverse = reverse * 10 + (n % 10);
			n = n / 10;
		}

		if(digit == reverse){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args) {
		
	}
}