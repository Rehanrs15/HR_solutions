L1 = list(map(int,input().split()))
L2 = list(map(int,input().split()))
c = 0
for i in range(len(L1)):
    if L1[i] != L2[i]:
        if L1[i] > L2[i]:
            if L2[i] % 9 !=0:
                c = c + ((L1[i] % 9 + L2[i] % 9)+1)
            else:
                c = c + (L1[i] % 9 + L2[i] % 9)
        else:
            c = c + (L2[i] % 9 - L1[i] % 9)
print(c)
