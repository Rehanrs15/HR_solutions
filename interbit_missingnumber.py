def func(A):
    mi = min(A)
    ma = max(A)
    sum2 = 0
    sum1 = 0
    
    for i in range(mi,ma+1):
        sum2 = sum2 + i

    for i in A:
        sum1 = sum1 + i

    if sum1 > sum2:
        val = sum1 - sum2
    else:
        val = sum2 - sum1
        
    if sum1 < 0:
        print(1)
    elif val == 0:
        print(ma+1)
    else:
        print(val)

l = list(map(int,input().split()))
func(l)
