class recursion {
	public int get_fib(int value){
		if(value == 0){
			return 0;
		}else if(value == 1){
			return 1;
		}
	    return get_fib(value - 1) + get_fib(value - 2);
	}
	
	public static void main(String[] args) {
		
	}
}