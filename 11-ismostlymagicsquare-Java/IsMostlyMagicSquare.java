// isMostlyMagicSquare(a) [15 pts]
// Write the function isMostlyMagicSquare(a) that takes an 2d list of numbers, which you may assume is an NxN square 
// with N>0, and returns True if it is "mostly magic" and False otherwise, where a square is "mostly magic" if:
// Each row, each column, and each of the 2 diagonals each sum to the same total.
// A completely magic square has additional restrictions (such as not allowing duplicates, and only allowing numbers 
// from 1 to N2), which we are not enforcing here, but which you can read about here. Note: any magic square is also 
// a "mostly magic" square, including this sample magic square:
// Read for more: https://en.wikipedia.org/wiki/Magic_square
// Here is another mostly-magic square:
// [ [ 42 ]]
// That square is 1x1 and each row, column, and diagonal sums to 42! And finally, here is a not-mostly-magic square:
// [ [ 1, 2],
//   [ 2, 1]]
// Each row and each column add to 3, but one diagonal adds to 2 and the other to 4.

public class IsMostlyMagicSquare {
	public boolean isMostlyMagicSquare(int[][] arr) {
		// Your code goes here
		int sum1 = 0;
		int sum2 = 0;

		for(int i = 0; i < arr.length; i++) {
			sum1 = sum1 + arr[i][i];
		}

		for (int i = 0; i < arr.length; i++){ 
			sum2 = sum2 + arr[i][arr.length - 1 - i];
		}

		if(sum1 != sum2){
			return false;
		}

		for (int i = 0; i < arr.length; i++) { 
  
            int rowSum = 0; 
            for (int j = 0; j < arr.length; j++){
				rowSum = rowSum + arr[i][j];
			} 
   
            if (rowSum != sum1){
				return false; 
			}
		}
		
		for (int i = 0; i < arr.length; i++) { 
  
            int colSum = 0; 
            for (int j = 0; j < arr.length; j++){
				colSum = colSum + arr[j][i]; 
			}

            if (sum1 != colSum){
				return false; 
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
	}
}
