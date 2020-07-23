// # Write the function nthUglyNumber that takes a non-negative int n and returns the nth Ugly Number. 
// # Ugly numbers are numbers whose only prime factors are 2, 3 or 5. The sequence 1, 2, 3, 4, 5, 6, 8, 
// # 9, 10, 12, 15 shows the few ugly numbers. By convention, nthUglyNumber(0) will give 1.

public class nth_uglynumber {
	public int fun_nth_uglynumber(int n){
		if(n == 0){
			return 1;
		}
		int start = 2;
		int count = 0;
		while(true){
			if(isUgly(start)){
				count = count + 1;
				if(count == n){
					return start;
				}
			}
			start = start + 1;
		}
	}

	public boolean isUgly(int n){
		n = maxDivide(n , 2);
		n = maxDivide(n , 3);
		n = maxDivide(n , 5);

		if(n == 1){
			return true;
		}else{
			return false;
		}
	}

	public int maxDivide(int a, int b){
		while(a % b == 0){
			a = a / b;
		}
		return a;
	}

	public static void main(String[] args) {
		
	}
}