// canQueenAttack(qX, qY, oX, oY) [15 pts]
// Given the position of the queen (qX, qY) and the opponent (oX, oY) on a chessboard. The task is to determine 
// whether the queen can attack the opponent or not. Note that the queen can attack in the same row, same column and 
// diagonally.

public class CanQueenAttack {
	public boolean canQueenAttack(int x, int y, int a, int b) {
		// Your code goes here
		if(x == a){
			return true;
		}

		if(y == b){
			return true;
		}

		if(Math.abs(x - y) == Math.abs(a - b)){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
	}
}