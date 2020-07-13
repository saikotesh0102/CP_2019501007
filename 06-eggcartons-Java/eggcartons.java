// # Write the function eggCartons(eggs) that takes 
// # a non-negative integer number of eggs, and returns 
// # the smallest integer number of cartons required to hold 
// # that many eggs, where a carton may hold up to 12 eggs

class eggcartons {
	public int fun_eggcartons(int eggs){
		if(eggs > 0){
			if(eggs % 12 == 0){
				return eggs / 12;
			}else{
				return (eggs / 12) + 1;
			}
		}else{
			return 0;
		}
	}
}