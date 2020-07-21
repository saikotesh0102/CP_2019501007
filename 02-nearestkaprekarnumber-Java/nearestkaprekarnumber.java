// # Note: please do not start this problem prior to completing previous problem. 
// # Bearing in mind the definition of Kaprekar Number from above problem, write the function 
// # nearestKaprekarNumber(n) that takes an int value n and returns the Kaprekar number 
// # closest to n, with ties going to smaller value. For example, nearestKaprekarNumber(49) returns 45, 
// # and nearestKaprekarNumber(51) returns 55. And since ties go to the smaller number, 
// # nearestKaprekarNumber(50) returns 45. 
// # Note: as you probably guessed, this also cannot be solved by counting up from 0, 
// # as that will not be efficient enough to get past the autograder. 
// # Hint: one way to solve this is to start at n and grow in each direction until you find a Kaprekar number.

public class nearestkaprekarnumber {
	public long fun_nearestkaprekarnumber(long n){
		long pdigit = n;
		long ndigit = n;
		while(true){
			if(is_kaprekar(pdigit)){
				break;
			}
			pdigit++;
		}

		long pCount = pdigit - n;

		while(true){
			if(is_kaprekar(ndigit)){
				break;
			}
			ndigit--;
		}

		long nCount = n - ndigit;

		if(nCount <= pCount){
			return ndigit;
		}else{
			return pdigit;
		}
	}

	public boolean is_kaprekar(long n){
		if(n == 1){
			return true;
		}

		long sq_n = n * n;
		int digitCount = 0;
		while (sq_n != 0) { 
            digitCount++; 
            sq_n = sq_n / 10; 
		}
		sq_n = n * n;

		for(int i = 0; i < digitCount; i++){
			int eq_parts = (int) Math.pow(10, i);
			if(eq_parts == n){
				continue;
			}

			long sum = sq_n / eq_parts + sq_n % eq_parts; 
            if(sum == n){
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
	}
}