a = [1,2,3,4,7,6]
num = int(input())
l = set()
c = 0
f = 1
for i in a:
    g = num - i
    c = c + 1
    if g not in l:
        l.add(i)
    else:
        print(i,g)
        f = 0
        break
        
if c == len(a) and f != 0:
    print("not found")
