import javax.print.attribute.standard.ReferenceUriSchemesSupported;

// # Write the function getInRange(x, bound1, bound2) which takes 3 int values
// # x, bound1, and bound2, where bound1 is not necessarily less than bound2. 
// # If x is between the two bounds, just return it unmodified. Otherwise, 
// # if x is less than the lower bound, return the lower bound, 
// # or if x is greater than the upper bound, return the upper bound.

class getinrange {
	public int fun_getinrange(int x, int bound1, int bound2){
		// Your code goes here
		if(bound1 < bound2){
			if (x < bound1){
				return bound1;
			}else if (x > bound2){
				return bound2;
			}else{
				return x;
			}
		}else{
			if (x > bound1){
				return bound1;
			}else if (x < bound2){
				return bound2;
			}else{
				return x;
			}
		}
	}
}