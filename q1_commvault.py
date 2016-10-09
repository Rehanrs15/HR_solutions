n,m = map(int,input().split(" "))
for i in range(n):
    m = m / 2
print(m%(pow(10,9)*7))
