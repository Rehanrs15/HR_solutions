num = int(input())
l = list(map(int,input().split(" ")))
print(num)
for i in l:
    c = 0
    m = min(l)
    l = [i - m for i in l if i-m !=0]
    c = len([c + 1 for i in l if i != 0])
    if c == 0:
        break
    print(c)
