t = int(input())
val = 0
for i in range(t):
    arr = list(map(int,input().split(" ")))
    c = arr[0]
    s = arr[0]
    n = 0
    for j in arr:
        c = max(j,j*c)
        s = max(s,c)
        val = val + 1
        if val == 3:
            n= n+ 1
            arr = arr[n:]
    print(s)
