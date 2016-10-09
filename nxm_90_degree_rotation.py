def send(row,no):
    col = m-no
    for i in range(len(row)):
        print(i,col,"=",row[i])
        N[i][col] = row[i]

n = int(input())
m = int(input())
A = list()
for i in range(n):
    l = list(map(int,input().split(" ")))
    A.append(l)
N = [[0]*n]*m
for i in range(n):
    send(A[i],i)

'''    
for i in range(m):
    for j in range(n):
        print(N[i][j],end=" ")
    print("")
'''
print(N)
