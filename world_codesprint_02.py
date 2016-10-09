L1 = list(map(int,input().split()))
L2 = list(map(int,input().split()))
c = 0
for i in range(len(L1)):
    if L1[i] != L2[i]:
        val = L1[i] - L2[i]
        val1 = L2[i] - L1[i]
        if val < 0:
            val = 10 - abs(val)
        if val1 < 0:
            val1 = 10 - abs(val1)
        c = c + min(val,val1)
print(c)
