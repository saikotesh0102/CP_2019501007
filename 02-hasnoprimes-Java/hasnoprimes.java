// # Write the function hasnoprimes(int[][] arr) that takes a 2d array arr of integers, 
// # and returns True if arr does not contain any primes, and False otherwise.


public class hasnoprimes {
	public boolean fun_hasnoprimes(int[][] arr){
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++){
				if(isPrime(arr[i][j])){
					return false;
				}
			}
		}
		return true;
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