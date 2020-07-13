// # Write the function circlesIntersect(x1, y1, r1, x2, y2, r2) 
// # that takes 6 numbers (ints) -- x1, y1, r1, x2, y2, r2 -- 
// # that describe the circle centered at (x1,y1) with radius r1, 
// # and the circle centered at (x2,y2) with radius r2, and returns True 
// # if the two circles intersect and False otherwise.

class circlesintersect {
	public boolean fun_circlesintersect(int x1, int y1, int r1, int x2, int y2, int r2){
		int dist = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
		int radi = (r1 + r2) * (r1 + r2);

		if(dist == radi){
			return true;
		}else if(dist < radi){
			return true;
		}else{
			return false;
		}
	}
}