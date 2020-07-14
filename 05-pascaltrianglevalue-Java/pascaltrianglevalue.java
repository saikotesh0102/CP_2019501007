// # Write the function pascalsTriangleValue(row, col) 
// # that takes int values row and col, and returns the 
// # value in the given row and column of Pascal's 
// # Triangle where the triangle starts at row 0, and 
// # each row starts at column 0. If either row or col 
// # are not legal values, return None, instead of crashing. 

class pascaltrianglevalue {

	public int factorial(int n){
		int i = 0;
		for(i = 1; i <=n; i++){
			i = i * n;
		}
		return i;
	}

	public int combinations(int r, int c){
		return factorial(r) / (factorial(r - c) * factorial(c));
	}

	public int fun_pascaltrianglevalue(int row, int col){
		// your code goes here
		int v = 0;
		for(int i = 0; i <= row; i++){
			for (int j = 0; j <= col; j++) {
				v = combinations(i, j);
			}
		}
		return v;
	}
	
	public static void main(String[] args) {
		
	}
}