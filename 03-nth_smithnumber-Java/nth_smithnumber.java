// # Write the function nthSmithNumber that takes a non-negative int n 
// # and returns the nth Smith number, where a Smith number is a composite (non-prime) 
// # the sum of whose digits are the sum of the digits of its prime factors (excluding 1). 
// # Note that if a prime number divides the Smith number multiple times, its digit sum 
// # is counted that many times. For example, 4 equals 2**2, so the prime factor 2 is 
// # counted twice, thus making 4 a Smith Number.
// # so fun_nthsmithnumber(0) should return 4
// # so fun_nthsmithnumber(1) should return 22

import java.util.*;
 
public class nth_smithnumber {
	public int fun_nth_smithnumber(int n) {
		if(n == 0){
			return 4;
		}	
		int start = 2;
		int count = 0;
		while(true){
			if(isSmithNumber(start)){
				count = count + 1;
				if(count == n){
					return start;
				}
			}
			start = start + 1;
		}
	}

	public boolean isSmithNumber(int n){
		if(isPrime(n)){
			return false;
		}else{
			ArrayList<Integer> res = primeFactors(n);
			Iterator it = res.iterator();
			int sum = 0;

			while(it.hasNext()){
				int number = (int)it.next();
				while(number != 0){
					sum = sum + (number % 10);
					number = number / 10;
				}
			}

			int temp = 0;
			while(n != 0) {
				temp = temp + (n % 10);
				n = n / 10;
			}
			if(temp==sum) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static ArrayList<Integer> primeFactors(int number) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int i = 2; i < number; i++) {
			while(number % i == 0) {
				res.add(i);
				number = number / i;
			}
		}
		if(number > 2) {
		   res.add(number);
		}
		return res;
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

	public static void main(String[] args) {
		
	}
}