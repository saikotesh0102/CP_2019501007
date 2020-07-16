// # rectanglesOverlap(left1, top1, width1, height1, left2, top2, width2, height2)
// # A rectangle can be described by its left, top, width, and height. This function 
// # takes two rectangles described this way, and returns True if the rectangles 
// # overlap at all (even if just at a point), and False otherwise. 
// # Note: here we will represent coordinates the way they are usually represented in 
// # computer graphics, where (0,0) is at the left-top corner of the screen, and while 
// # the x-coordinate goes up while you head right, the y-coordinate goes up while you 
// # head down (so we say that "up is down")

class rectangle_overlap {
	public boolean fun_rectangle_overlap(int left1, int top1, int width1, int height1, int left2, int top2, int width2, int height2){
		width1 = width1 + left1;
		width2 = width2 + left2;

		if(left2 > width1 || left1 > width2){
			return false;
		}

		height1 = height1 + top1;
		height2 = height2 + top2;

		if(top2 > height1 || top1 > height2){
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
	}
}