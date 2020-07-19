// # Write the function alternatingSum(L) that takes a possibly-empty array of numbers, 
// # and returns the alternating sum of the array, where every other value is subtracted 
// # rather than added. For example: alternatingSum([1,2,3,4,5]) returns 1-2+3-4+5 
// # (that is, 3). If L is empty, return 0. You may not use loops/iteration in this problem.


class recursions_alternatingsum {
	public int fun_recursions_alternatingsum(int[] arr){
		if(arr.length == 0){
			return 0;
		}
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			if(i % 2 == 0){
				sum = sum + arr[i];
			}else{
				sum = sum - arr[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		
	}
}