// # Write the function matrixMultiply(m1, m2) that takes two 2d arrays 
// # (that we will consider to be matrices) and returns a new 2d array that 
// # is the result of multiplying the two matrices. Return [[]] if the 
// # two matrices cannot be multiplied for any reason.

class matrixmultiply {
	public int[][] fun_matrixmultiply(int[][] a, int[][] b){
		int[][] arr = new int[a.length][b[0].length];
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < b[0].length; j++){
				for(int k = 0; k < a[0].length; k++) {
					arr[i][j] = arr[i][j] + (a[i][k] * b[k][j]);
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		
	}
}