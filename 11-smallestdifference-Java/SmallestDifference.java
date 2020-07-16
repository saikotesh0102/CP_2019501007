// Write the function smallestDifference(a) that takes a list of integers and returns 
// the smallest absolute difference between any two 
// integers in the list. If the list is empty, return -1. For example:
//       assert(smallestDifference([19,2,83,6,27]) == 4)
// The two closest numbers in that list are 2 and 6, and their difference is 4.

public class SmallestDifference {

    public int smallestDifference(int[] arr) {
        // Your code goes here
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length; j++){
                if (Math.abs((arr[i] - arr[j])) < min){
                    min = Math.abs((arr[i] - arr[j]));
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        
    }
}
