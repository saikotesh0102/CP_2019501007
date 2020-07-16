// # Write the function interleave(s1, s2) that takes two strings, s1 and s2, 
// # and interleaves their characters starting with the first character in s1. 
// # For example, interleave('pto', 'yhn') would return the string "python". 
// # If one string is longer than the other, concatenate the rest of the remaining 
// # string onto the end of the new string. For example ('a#', 'cD!f2') would return 
// # the string "ac#D!f2". Assume that both s1 and s2 will always be strings.


class interleave {
	public String fun_interleave(String s1, String s2){
		String res = ""; 
		if(s1.length() == 0){
			return res + s2;
		}else if(s2.length() == 0){
			return res + s1;
		}else{
			for (int i = 0; i < s1.length() || i < s2.length(); i++) {
				if(i >= s1.length()){
					for(int j = i; j < s2.length(); j++){
						System.out.println(s2.charAt(j));
						res = res + s2.charAt(j);
					}
				}else if(i >= s2.length()){
					res = res + s1.substring(i, s1.length());
				}else{
					res = res + s1.charAt(i) + s2.charAt(i);
				}
			}
			return res;
		}
	}

	public static void main(String[] args) {
		interleave ob = new interleave();
		System.out.println(ob.fun_interleave("a#", "cD!f2"));
	}
}