l = list(map(int,input().split(" ")))
s =set()
for i in range(len(l)):
    ans = sum([j * n for j,n in zip(l,range(len(l)))])
    s.add(ans)
    l = l[i+1:]+l[:i+1]
print(max(s))
