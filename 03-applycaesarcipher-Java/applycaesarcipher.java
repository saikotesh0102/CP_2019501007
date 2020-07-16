// # A Caesar Cipher is a s.charAt(i)mple cipher that works by shifting each letter in 
// # the given message by a certain number. For example, if we shift the message 
// # "We Attack At Dawn" by 1 letter, it becomes "Xf Buubdl Bu Ebxo"
// # Write the function applyCaesarCipher(message, shift) which shifts the given 
// # message by shift letters. You are guaranteed that message is a string, and 
// # that shift is an integer between -25 and 25. Capital letters should stay capital 
// # and lowercase letters should stay lowercase, and non-letter characters should not be changed. 
// # Note that "Z" wraps around to "A". So, for example:
// # assert(applyCaesarCipher("We Attack At Dawn", 1) == "Xf Buubdl Bu Ebxo")
// # assert(applyCaesarCipher("zodiac", -2) == "xmbgya")

class applycaesarcipher {
	public String fun_applycaesarcipher(String msg, int shift){
		// your code goes here
		StringBuilder res = new StringBuilder();
		for(int i = 0; i < msg.length(); i++){
			if(Character.isUpperCase(msg.charAt(i))){
				char ch = (char)(((int)msg.charAt(i) + shift - 65) % 26 + 65); 
                res.append(ch); 
			}else if(Character.isLowerCase(msg.charAt(i))){
				char ch = (char)(((int)msg.charAt(i) + shift - 97) % 26 + 97); 
                res.append(ch); 
			}else{
				res.append(msg.charAt(i));
			}
		}
		return res.toString();
	}

	public static void main(String[] args) {
		
	}
}