// nthWithProperty309(n) [20 pts]
// We will say that a number n has "Property309" if its 5th power contains every 
// digit (from 0 to 9) at least once. 309 is the smallest number with this property. 
// Write the function nthWithProperty309 that takes a non-negative int n and returns 
// the nth number with Property309.

public class NthWithProperty309 {
	public int nthWithProperty309(int n) {
		//Your code goes here
		if(n == 0){
			return 309;
		}
		int count = 0;
		int start = 310;
		while(true){
			if(isProperty309(start)){
				count = count + 1;
				if(count == n){
					return start;
				}
			}
			start = start + 1;
		}
	}

	public boolean isProperty309(int number){
		String res = Integer.toString((int)Math.pow(number, 5));
		if(res.contains("0") && res.contains("1") && res.contains("2") && res.contains("3") && res.contains("4") && res.contains("5") && res.contains("6") && res.contains("7") && res.contains("8") && res.contains("9")){
			System.out.println(number);
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		NthWithProperty309 ob = new NthWithProperty309();
		System.out.println(ob.nthWithProperty309(1));
	}
}