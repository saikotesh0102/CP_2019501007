// # Write the function pascalsTriangleValue(row, col) 
// # that takes int values row and col, and returns the 
// # value in the given row and column of Pascal's 
// # Triangle where the triangle starts at row 0, and 
// # each row starts at column 0. If either row or col 
// # are not legal values, return None, instead of crashing. 

class get_kth_digit {
	public int fun_get_kth_digit(int digit, int k){
		// your code goes here
		StringBuilder res = new StringBuilder();
		res.append(Integer.toString(Math.abs(digit)));
		res.reverse();
		if(k > res.length() - 1){
			return 0;
		}else{
			System.out.println(res.charAt(k));
			return (int)res.charAt(k);
		}
	}

	public static void main(String[] args) {
		
	}
}