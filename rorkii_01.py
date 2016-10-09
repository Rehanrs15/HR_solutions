from collections import Counter
t = int(input())
s = list(input().split(" "))
d = Counter(s)
val = max(d)
print(d.get(val))
