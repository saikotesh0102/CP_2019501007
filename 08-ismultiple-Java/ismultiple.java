// # Write the function isMultiple that takes two int values m and n 
// # and returns True if m is a multiple of n and False otherwise. 
// # Note that 0 is a multiple of every integer including itself. 
// # Also, you should make constructive use of the isFactor function you just wrote above.

import java.lang.*;

class ismultiple {
	public boolean fun_ismultiple(int m, int n){
		// your code goes here
		if(n == 0 && m > 0){
			return false;
		}else if(m == 0 && n == 0){
			return true;
		}else if(m % Math.abs(n) == 0){
			return true;
		}else{
			return false;
		}
	}
}