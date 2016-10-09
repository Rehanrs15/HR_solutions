def repeatedNumber(A):
    mi = min(A)
    ma = max(A)
    sum_01 = 0
    sum_02 = 0
    for i in range(mi,ma+1):
        sum_01 = sum_01 + i
    for i in A:
        sum_02 = sum_02 + i
    d = dict()
    for i in A:
        c = 0
        if i not in d.keys():
            d[i] = 1
        else:
            c = d.get(i)
            c = c+1
            d[i] = c
    f = 0
    for i in d.keys():
        if d[i] > 1:
            f = i
            break
    print([f,sum_01 - sum_02 + f])

l = list(map(int,input().split(" ")))
repeatedNumber(l)
