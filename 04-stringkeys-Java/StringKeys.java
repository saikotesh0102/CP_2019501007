import java.util.*;

public class StringKeys {
	Hashtable<Integer, ArrayList<String>> table;
	public StringKeys() {
		// Your code goes here
	}

	public void store(String key) {
		// Your code goes here
		ArrayList<String> list = new ArrayList<String>();
		if(table.keySet().contains(calculate_hash_value(key))){
			list.add(key);
			table.put(calculate_hash_value(key),list);
		}else{
			list.add(key);
			table.put(calculate_hash_value(key),list);
		}
	}

	public int lookup(String key) {
		if(table.get(calculate_hash_value(key)).contains(key)){
			return calculate_hash_value(key);
		}
		return -1;
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