// # largestNumber: Write the function largestNumber(text) that takes a string of text and 
// # returns the largest int value that occurs within that text, or 0 if no such value occurs. 
// # You may assume that the only numbers in the text are non-negative integers and 
// # that numbers are always composed of consecutive digits (without commas, for example). For example:
// #     	largestNumber("I saw 3 dogs, 17 cats, and 14 cows!")
// # returns 17 (the int value 17, not the string "17"). And
// #     	largestNumber("One person ate two hot dogs!")
// # returns None (the value None, not the string "None").


public class largestnumber {
	public int fun_largestnumber(String str){
		int num = 0;
		int result = 0;
		
		for(int i = 0; i < str.length(); i++){
			if (Character.isDigit(str.charAt(i))){
				num = num * 10 + (str.charAt(i) - '0');
			} else{ 
                result = Math.max(result, num);  
                num = 0; 
            } 
		}
		return Math.max(result, num);
	}

	public static void main(String[] args) {
		
	}
}
	