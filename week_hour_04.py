def poss(s,m):
    d = dict()
    sl = len(s)
    g = abs(sl - m)
    for i in range(m):
        v = s + s[:i]
        k = len(v)
        if k <=m:
            d[v] = 1
    l = d.keys()
    c = 0
    #print(l)
    for i in l:
        v1 = i+s
        v2 = s+i
        if v1 == v2:
            c = c + 1
    print(c)

s = input()
m = int(input())
poss(s,m)
