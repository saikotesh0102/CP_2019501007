import java.util.Arrays;

// median(a) (10 pts)
// Write the non-destructive function median(a) that takes a list of ints or floats and returns the median value, 
// which is the value of the middle element, or the average of the two middle elements if there is no single middle 
// element. If the list is empty, return None.

public class Median {
	public int median(double[] list) {
		// Your code goes here
		Arrays.sort(list);
		double median;
		if (list.length % 2 == 0)
			median = ((double)list[list.length / 2] + (double)list[list.length / 2 - 1]) / 2;
		else
			median = (double) list[list.length / 2];
		return (int)median;
	}
}