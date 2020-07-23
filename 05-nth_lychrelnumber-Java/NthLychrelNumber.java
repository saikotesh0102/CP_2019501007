// nthLychrelNumber(n) [20 pts]
// A Lychrel number is a natural number that cannot form a palindrome through the iterative process of 
// repeatedly reversing its digits and adding the resulting numbers. This process is sometimes called the 
// 196-algorithm, after the most famous number associated with the process.
// The first few Lychrel numbers are 196, 295, 394, 493, 592, 689, 691, 788, 790, 879, 887….

public class NthLychrelNumber {
	public long nthLychrelNumber(int n) {
		// Your code goes here
		if(n == 1){
			return 196;
		}
		long start = 197;
		int count = 1;
		while(true){
			if(isLychrel(start)){
				System.out.println(start);
				count = count + 1;
				if(count == n){
					return start;
				}
			}
			start = start + 1;
		}
	}

	public boolean isLychrel(long number){
		int MAX_ITERATIONS = 20;

		for (int i = 0; i < MAX_ITERATIONS; i++) { 
            number = number + reverse(number);
            if (isPalindrome(number)){ 
				return false;
			}
        } 
        return true;
	}

	private boolean isPalindrome(long number) { 
        return number == reverse(number); 
	} 
	
	private static long reverse(long number) { 
        long reverse = 0; 
  
        while (number > 0) { 
            long remainder = number % 10; 
            reverse = (reverse * 10) + remainder; 
            number = number / 10; 
        } 
        return reverse; 
    }

	public static void main(String[] args) {
		NthLychrelNumber ob = new NthLychrelNumber();
		System.out.println(ob.nthLychrelNumber(4));
	}
}