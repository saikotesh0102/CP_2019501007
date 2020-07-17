import java.util.*;

public class StringKeys {
	Hashtable<Integer, List<String>> table;
	public StringKeys() {
		// Your code goes here
	}

	public void store(String key) {
		// Your code goes here
	}

	public int lookup(String key) {
		// Your code goes here
		return 1;
	}

	public int calculate_hash_value(String key) {
		// Your code goes here
		return ((int)(key.charAt(0)) * 100) + (int)(key.charAt(1));
	}

	public void show_bucket(String key) {
		// Your code goes here
	}

	public static void main(String[] args) {
		
	}
}