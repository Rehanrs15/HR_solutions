t = int(input())
d = dict()
for i in range(t):
    s = input()
    s = ''.join(sorted(s))
    if s not in d.keys():
        d[s] = 1
    else:
        continue
print(len(d))
