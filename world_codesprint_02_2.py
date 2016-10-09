L1 = list(map(int,input().split()))
L2 = list(map(int,input().split()))
L = [0,1,2,3,4,5,6,7,8,9]
c = 0
for i in range(len(L1)):
    if L1[i] != L2[i]:
        if L1[i] < L2[i]:
            c = c + (L2[i] - L1[i])
        else:
            if L1[i] != 9:
                c =c +  len(L[L1[i]:]) + len(L[:L2[i]])
            else:
                c = c + len(L[:L2[i]+1])
print(c)
