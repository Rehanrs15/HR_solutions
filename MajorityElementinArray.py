arr = list(map(int,input().split(" ")))
d = dict()
for i in arr:
    count = 0
    if i in d.keys():
        count = d.get(i)
        d[i] = count + 1
    else:
        d[i] = count + 1

f = 0
for j in d.keys():
    if d[j] > len(arr)//2:
        f = 1
        print(j)
        break
if f != 1:
    print(None)
