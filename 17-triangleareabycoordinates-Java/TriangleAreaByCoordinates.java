// triangleareabycoordinates(x1, y1, x2, y2, x3, y3)[5pts]
// Write the function triangleareabycoordinates(x1, y1, x2, y2, x3, y3) that takes 6 int or float
// values that represent the three points (x1,y1), (x2,y2), and (x3,y3), and returns as a float the
// area of the triangle formed by those three points. Hint: you should make constructive use of
// the triangleArea function you just wrote above.

public class TriangleAreaByCoordinates {
	public int triangleAreaByCoordinates(double x1, double y1, double x2, double y2, double x3, double y3) {
		// Your code goes here
		double a = distance(x1, y1, x2, y2);
		double b = distance(x2, y2, x3, y3);
		double c = distance(x1, y1, x3, y3);

		double s = (a + b + c) / 2;

		return (int)Math.sqrt(s * (s -a) * (s - b) * (s -c));
	}

	public double distance(double x1, double y1, double x2, double y2){
		return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
	}
}