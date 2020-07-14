// # Write the function nearestOdd(n) that takes an double n, 
// # and returns as an int value the nearest odd number to n. 
// # In the case of a tie, return the smaller odd value. 
// # Note that the result must be an int, so nearestOdd(13.0) is the int 13, and not the double 13.0.

class nearestodd {
	public int fun_nearestodd(double n){
		// your code goes here
		if((n / 2) % 2 == 0){
			return (int)Math.round((n / 2)) * 2 - 1;
		}else{
			int digit = (int)(n);
			System.out.println(digit);
			if(digit % 2 == 1){
				return digit;
			}else{
				return (int)Math.round((n / 2)) * 2 + 1;
			}
		}
	}

	public static void main(String[] args) {
		
	}
}