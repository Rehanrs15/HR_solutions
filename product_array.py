a = [5,7,9,22,15,344,92,8]
p = 46
y = 0
for i in range(0,len(a)):
    for j in range(i+1,len(a)):
        x = a[i] * a[j]
        if x == p:
            y = 1
            print("YES")
            break 
if y != 1 :
    print("NO")
