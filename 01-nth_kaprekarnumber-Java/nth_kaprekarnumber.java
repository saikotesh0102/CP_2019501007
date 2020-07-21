// # Background: a Kaprekar number is a non-negative integer, the representation of whose square 
// # can be split into two possibly-different-length parts (where the right part is not zero) 
// # that add up to the original number again. For instance, 45 is a Kaprekar number, because 
// # 45**2 = 2025 and 20+25 = 45. You can read more about Kaprekar numbers here. The first several 
// # Kaprekar numbers are: 1, 9, 45, 55, 99, 297, 703, 999 , 2223, 2728,... 
// # With this in mind, write the function nthKaprekarNumber(n) that takes a non-negative int n 
// # and returns the nth Kaprekar number, where as usual we start counting at n==0.

class nth_kaprekarnumber {
	public long fun_nth_kaprekarnumber(long n){
		if(n == 0){
			return 1;
		}
		int count = 0;
		int start = 2;
		while(true){
			if(is_kaprekar(start)){
				count = count + 1;
				if(count == n){
					return start;
				}
			}
			start = start + 1;
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
		nth_kaprekarnumber ob = new nth_kaprekarnumber();
		System.out.println(ob.is_kaprekar(77778));
	}
}