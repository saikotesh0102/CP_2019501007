// # Write the function fun_threelines_area(d1, d2, d3) 
// # that takes length of 3 sides
// # find the area of a triangle(return an int) given its side lengths.
// Sai Koteswara Rao Ch

public class threelines_area {
	public int fun_threelines_area(int a, int b, int c){
		double s = (a + b + c) / 2.0;
		return (int)Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	public static void main(String[] args) {
		
	}
}