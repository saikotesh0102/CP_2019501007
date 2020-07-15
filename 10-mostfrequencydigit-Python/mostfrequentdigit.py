# mostFrequentDigit(n) [10pts]
# Write the function mostFrequentDigit(n), that takes a non-negative integer n and returns the digit from 0 to 9 
# that occurs most frequently in it, with ties going to the smaller digit.

def mostfrequentdigit(n):
	# your code goes here
	d = {}
	for i in list(str(n)):
		if i not in d:
			d[i] = list(str(n)).count(i)

	maximum = max(d.values())
	l = []
	for i in d:
		if d[i] == maximum:
			l.append(i)

	return int(min(l))