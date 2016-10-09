testcase = int(input())
for i in range(testcase):
	strength = int(input())
	A = int(strength/2)
	B = int(A) + (strength % 2)
	print(A,B)
