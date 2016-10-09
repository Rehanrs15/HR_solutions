import itertools
L1 = list()
s = 0
def formula(x,y):
    global L1,s
    for i in x:
        for j in y:
            s = s + abs(i - j)
    L1.append(s)
    
L2 = list()
def formula1(x,y):
    global L1,s
    for i in x:
        for j in y:
            s = s + abs(i - j)
    L2.append(s)
    



n,k = map(int,input().split())
L = list(map(int,input().split()))

x = list(itertools.combinations(L,k))
x1 = list(itertools.combinations(L,k))
if x == x1:
    for i in range(len(x)):
        for j in range(1,len(x)):
            formula(x[i],x[j])
    global L1
    print(min(L1))
else:
    for i in x:
        for j in x1:
            formula1(x,x1)
    global L2
    print(min(L2))
        
