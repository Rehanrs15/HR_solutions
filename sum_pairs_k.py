l = list(map(int,input().split(" ")))
num = int(input())
s = set()
count = 0
for i in l:
    v = num - i
    if v not in s:
        s.add(i)
    else:
        count = count + 1
        print(i,v)
print(count)
