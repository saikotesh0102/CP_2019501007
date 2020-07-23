// # Write the function nthTidyNumber that takes a non-negative int n and returns the nth Tidy Number. 
// # A tidy number is a number whose digits are in non-decreasing order.
// # fun_nth_tidynumber(0) = 1
// # fun_nth_tidynumber(1) = 2
// # fun_nth_tidynumber(5) = 6
// # fun_nth_tidynumber(15) = 17
// # fun_nth_tidynumber(35) = 46

public class nth_tidynumber {
	public int fun_nth_tidynumber(int n){
		if(n == 0){
			return 1;
		}
		int start = 2;
		int count = 0;
		while(true){
			if(isTidy(start)){
				count = count + 1;
				if(count == n){
					return start;
				}
			}
			start = start + 1;
		}
	}

	public boolean isTidy(int n){
		int previous = 10;
		
		while(n != 0){
			int rem = n % 10;
			n = n / 10;
			if(rem > previous){
				return false;
			}
			previous = rem;
		}
		return true;
	}

	public static void main(String[] args) {
		
	}
}