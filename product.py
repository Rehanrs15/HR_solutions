N = int(input())
a = input()
l = list(map(int,a.split(" ")))
s = 1
for i in l:
	s = s * i
print(s)
