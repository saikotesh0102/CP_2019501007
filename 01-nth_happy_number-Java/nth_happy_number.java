// # Write the function nthHappyNumber(n) which takes a non-negative integer 
// # and returns the nth happy number (where the 0th happy number is 1). 
// # Here are some test assertions for you:
// # assert(nthHappyNumber(0) == 1)
// # assert(nthHappyNumber(1) == 7)
// # assert(nthHappyNumber(2) == 10)
// # assert(nthHappyNumber(3) == 13)
// # assert(nthHappyNumber(4) == 19)
// # assert(nthHappyNumber(5) == 23)
// # assert(nthHappyNumber(6) == 28)
// # assert(nthHappyNumber(7) == 31)


class nth_happy_number {
	public int fun_nth_happy_number(int n){
		// your code goes here
		if(n == 0){
			return 1;
		}
		int start = 2;
		int count = 0;
		while(true){
			if(isHappyNumber(start)){
				count = count + 1;
				if(count == n){
					return start;
				}
			}
			start = start + 1;
		}
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