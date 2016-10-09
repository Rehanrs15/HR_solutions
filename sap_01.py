t = int(input())
for k in range(t):
	n = int(input())
	l = raw_input()
	l = map(int,l.split(" "))
	val = n
	for i in range(n):
	    if i <= n - 2:
	        if l[i] == l[i+1]:
	            val = val + 1
	print val
