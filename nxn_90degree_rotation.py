def Transpose(M):
    Mt = list()
    for i in range(n):
        l = list()
        for j in range(n):
            l.insert(j,M[j][i])
        Mt.append(l)
    return Mt


n = int(input())
A = list()
for i in range(n):
    item = list(map(int,input().split(" ")))
    A.append(item)

A = Transpose(A)
for i in range(n//2):
    k = n-1-i
    l=i
    h=k
    for j in range(n):
        temp = A[j][l]
        A[j][l] = A[j][h]
        A[j][h] = temp
for i in range(n):
    for j in range(n):
        print(A[i][j],end=" ")
    print("")
    
    
