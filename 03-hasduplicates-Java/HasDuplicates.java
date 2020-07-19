// hasDuplicates(L) [15 pts]
// Write the function hasDuplicates(L) that takes a 2d list L of arbitrary values, and returns True if L 
// contains any duplicate values (that is, 
// if any two values in L are equal to each other), and False otherwise.

public class HasDuplicates {
	public boolean hasDuplicates(int[][] arr) {
		// Your code goes here
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				for(int k = j + 1; k < arr[i].length; k++){
					if(arr[i][j] == arr[i][k]){
						return true;
					}
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
	}
}