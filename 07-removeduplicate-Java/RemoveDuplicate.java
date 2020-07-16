// removeDuplicate(text) [10 pts]
// Write a program to remove all the duplicate characters from a given input String,e.g.
// if given String is "JavaPython" then the output should be "JavPython".
// The second or further occurrence of duplicate should be removed.

public class RemoveDuplicate {
	public String removeDuplicate(String text) {
		// Your code goes here
		char[] arr = text.toCharArray();
		int count = 1;
		int flag = 1;

		while(flag != arr.length){
			if(arr[flag] != arr[flag - 1]){
				arr[count] = arr[flag];
				count++;
			}
			flag++;
		}
		text = new String(arr);
		return text.substring(0, count);
	}

	public static void main(String[] args) {
		
	}
}