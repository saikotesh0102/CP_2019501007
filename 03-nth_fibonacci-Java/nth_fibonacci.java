// # Background: The Fibonacci numbers are defined by F(n) = F(n-1) + F(n-2). 
// # There are different conventions on whether 0 is a Fibonacci number, 
// # and whether counting starts at n=0 or at n=1. Here, we will assume that 
// # 0 is not a Fibonacci number, and that counting starts at n=0, 
// # so F(0)=F(1)=1, and F(2)=2. With this in mind, write the function 
// # nthfibonaccinumber(n) that takes a non-negative int n and returns the nth Fibonacci number.


class nth_fibonacci {
	public int fun_nthfibonaccinumber(int n){
		// your code goes here
		if(n <= 1){
			return 1;
		}else if(n == 2){
			return 2;
		}else{
			return fun_nthfibonaccinumber(n - 1) + fun_nthfibonaccinumber(n - 2);
		}
	}

	public static void main(String[] args) {
		
	}
}