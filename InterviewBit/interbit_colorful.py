def colorful(N):
    N = str(N)
    L= list()
    for i in range(len(N)):
        for j in range(i,len(N)):
            L.append(int(N[i:j+1]))
    new  = list()
    for i in L:
        p = 1
        i = str(i)
        for j in range(len(i)):
            p = p* int(i[j])
        if p not in new:
            new.append(p)
    if len(new) == len(L):
        print(1)
    else:
        print(0)
N= input()
colorful(N)
