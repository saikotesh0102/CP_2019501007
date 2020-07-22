# Without using iteration and without using strings, 
# write the recursive function onlyEvenDigits(L), 
# that takes a list L of non-negative integers 
# (you may assume that), and returns a new list of 
# the same numbers only without their odd digits 
# (if that leaves no digits, then replace the number with 0). 
# So: onlyEvenDigits([43, 23265, 17, 58344]) returns [4, 226, 0, 844]. 
# Also the function returns the empty list if the original list is empty. 
# Remember to not use strings. You may not use loops/iteration in this problem.

def fun_recursion_onlyevendigits(l): 
	return recursion(l, [], 0)

def recursion(l, ar, i):
	if i == len(l):
		return ar
	else:
		num = l[i]
		r = []
		for i in range(num):
			rem = num % 10
			num = num // 10
			if rem % 2 == 0:
				r.append(rem)
		r = list(map(str, r[: : -1]))
		s = ''.join(r)
		if int(s) % 2 == 0:
			ar.append(int(s))
		i = i + 1
		return recursion(l, ar, i)