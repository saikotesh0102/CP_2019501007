// isrighttriangle(x1, y1, x2, y2, x3, y3)[5pts]
// Write the function isrighttriangle(x1, y1, x2, y2, x3, y3) that takes 6 int or float values that
// represent the vertices (x1,y1), (x2,y2), and (x3,y3) of a triangle, and returns True if that is
// a right triangle and False otherwise. You may wish to write a helper function,
// distance(x1, y1, x2, y2), which you might call several times. Also, remember to use
// almostEqual (instead of ==) when comparing floats.

import java.lang.*;

public class IsRightTriangle {
	public boolean isRightTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		// Your code goes here
		int a = distance(x1, y1, x2, y2);
		int b = distance(x2, y2, x3, y3);
		int c = distance(x1, y1, x3, y3);
		
		if((Math.pow(a,2) + Math.pow(b,2)) == Math.pow(c,2)){
			return true;
		}else if((Math.pow(b,2) + Math.pow(c,2)) == Math.pow(a,2)){
			return true;
		}else if((Math.pow(a,2) + Math.pow(c,2)) == Math.pow(b,2)){
			return true;
		}else{
			return false;
		}
	}

	public int distance(int x1, int y1, int x2, int y2){
		return (int)Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
	}
}