l = [1,2,3,4,5]
s =set()
c = 0
f = 0
p = int(input())
for i in l:
    if(p % i == 0):
        v = int(p/i)
        c = c + 1
        if v not in s:
            s.add(i)
        else:
            print("YES")
            print(i,v)
            f = 1
            break

if f != 1:
    print("NOT FOUND")
