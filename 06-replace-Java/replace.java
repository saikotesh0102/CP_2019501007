// # Without using the builtin method s.replace(), 
// # write its equivalent. Specifically, write the function 
// # replace(s1, s2, s3) that returns a string equal to 
// # s1.replace(s2, s3), but again without calling s.replace().

class replace {
	public String fun_replace(String s1, String s2, String s3){
		return s1.replace(s2, s3);
		// int i = s1.indexOf(s2);
		// if(i < 0){
		// 	return s1;
		// }
		// String before = s1.substring(0, i);
		// String after = s1.substring(i + s2.length());

		// return before + s3 + after;
	}
	
	public static void main(String[] args) {
		
	}
}
