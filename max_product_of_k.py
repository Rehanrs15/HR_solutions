def product(l):
    p = 1
    for i in l:
        p = p * i
    return p
k = int(input())
l = list(map(int,input().split(" ")))
prev_max = 0
n = k
for i in range(len(l)):
    if i <= (len(l) - k):
        pro = product(l[i:n])
        if pro > prev_max:
            prev_max = pro
        n = n + 1
print(prev_max)
