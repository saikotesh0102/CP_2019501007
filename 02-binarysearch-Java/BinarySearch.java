class BinarySearch {
	public int binary_search(int[] arr, int value){
		// Your code goes here
		int flag = 0;
		int len = arr.length - 1;
		while(flag <= len){
			int m = (flag + len) / 2;

			if(arr[m] < value){
				flag = m + 1;
			}else if(arr[m] > value){
				len = m - 1;
			}else{
				return m;
			}
		}
        return -1;
	}

	public static void main(String[] args) {
		
	}
}