def LognestCommon(L):
    s = L[0]
    N = list()
    for i in L:
        k = 0
        v = ""
        for j in i:
            if k < len(s):
                if s[k] == j:
                    v = v + j
                else:
                    break
                k = k + 1
            else:
                break
        N.append(v)
    N.sort(key=len)
    print(N[0])

i = list(map(str,input().split()))
LognestCommon(i)
        
