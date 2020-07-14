// isrighttriangle(x1, y1, x2, y2, x3, y3)[5pts]
// Write the function isrighttriangle(x1, y1, x2, y2, x3, y3) that takes 6 int or float values that
// represent the vertices (x1,y1), (x2,y2), and (x3,y3) of a triangle, and returns True if that is
// a right triangle and False otherwise. You may wish to write a helper function,
// distance(x1, y1, x2, y2), which you might call several times. Also, remember to use
// almostEqual (instead of ==) when comparing floats.

public class IsRightTriangle {
	public boolean isRightTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		// Your code goes here
		int a = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
		int b = ((x3 - x1) * (x3 - x1)) + ((y3 - y1) * (y3 - y1));
		int c = ((x2 - x3) * (x2 - x3)) + ((y2 - y3) * (y2 - y3));
		
		if ((a == (b + c) && a != 0 && b != 0 && c != 0) ||  (b == (a + c) && a != 0 && b != 0 && c != 0) ||  (c == (a + b) && a != 0 && b != 0 && c != 0)) { 
			return true; 
		} 
    	return false;
	}

	public static void main(String[] args) {
	}
}