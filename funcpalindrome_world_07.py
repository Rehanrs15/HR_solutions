def possible(A):
    l = list()
    for i in range(len(A)):
        for j in range(i,len(A)+1):
            if i != j:
                l.append(A[i:j])
    n = list()
    for i in l:
        if i == i[::-1]:
            n.append(i)
        
    n.sort()
    return n

def calculate(n):
    c = len(n)
    v = 10**9 + 7
    if c == 1:
        print(ord(n))
    else:
        sum = 0
        n = list(n)
        #print(n)
        for i in range(len(n)):
            sum = sum + (int(ord(n[i])) * (100001)**(c - (i+1))) 
        print(sum%v)


n,q = map(int,input().split())
l = input()
L = possible(l)
for i in range(q):
    k = int(input())
    if k > len(L):
        print(-1)
    else:
        calculate(L[k-1])
    

                
