def swap(m,n,i):
    for i in range(n):
        t1 = m[n][i]
        m[n][i] = m[n][n**2-1]
        m[n][n**2-1] = t1
        

m = list()
n = int(input())
for i in range(n*2):
    l = list(map(int,input().split()))
    m.append(l)

n2 = n*2
for i in range(n,n2):
    val1 = sum(m[n + i][i:n])
    val2 = sum(m[n + i][n:])
    if val1 > val2:
        m[i][::-1]
    else:
        continue

for i in range(n,n2):
    val1 =0
    val2 =0
    for k in range(0,n*2):
        if k < n:
            val1 = val1 + m[n][k]
        else:
            val2 = val2 + m[n][k]
    if val1 > val2:
        swap(m,n,i)

for i in range(0,n):
    val1 = sum(m[i][:n])
    val2 = sum(m[i][n:])
    if val1 > val2:
        m[i][::-1]
    else:
        continue

print(m)
        
                                                                                                                                                                                                                                                                                                                        
