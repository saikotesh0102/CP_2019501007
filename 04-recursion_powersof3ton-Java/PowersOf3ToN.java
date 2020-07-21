// Recursion-Only powersOf3ToN(n) [15 pts]
// Write the function powersOf3ToN(n) that takes a possibly-negative float or int n, and returns a list of the 
// positive powers of 3 up to and including n. As an example, powersOf3ToN(10.5) returns [1, 3, 9]. If no such powers 
// of 3 exist, you should return the empty list. You may not use loops/iteration in this problem. 

import java.util.*;

public class PowersOf3ToN {
	public int[] powersOf3ToN(double n) {
		// Your code goes here
		if(n < 1){
			return new int[0];
		}
		int[] res = new int[(int)(Math.log(n)/Math.log(3)) + 1];
		for(int i = 0; i < res.length; i++){
			res[i] = (int)Math.pow(3, i);
		}
		return res;
	}

	public static void main(String[] args) {
		PowersOf3ToN ob = new PowersOf3ToN();
		System.out.println(Arrays.toString(ob.powersOf3ToN(100)));
	}
}