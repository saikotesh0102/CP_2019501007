# nthWithProperty309(n) [20 pts]
# We will say that a number n has "Property309" if its 5th power contains every 
# digit (from 0 to 9) at least once. 309 is the smallest number with this property. 
# Write the function nthWithProperty309 that takes a non-negative int n and returns 
# the nth number with Property309.

def nthwithproperty309(n):
	# Your code goes here
	if n == 0:
		return 309
	count = 0
	start = 310
	while True:
		res = str(pow(start, 5))
		if "0" in res and "1" in res and "2" in res and "3" in res and "4" in res and "5" in res and "6" in res and "7" in res and "8" in res and "9" in res:
			count = count + 1
			if count == n:
				return start
		start = start + 1