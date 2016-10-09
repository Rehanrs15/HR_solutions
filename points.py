points = int(input())
l1 = list()
l2 = list()
for i in range(points):
    g = input()
    x,y = g.split(" ")
    x = int(x)
    y = int(y)
    if x not in l1:
        l1.append(x)
    if y not in l2:
        l2.append(y)
if len(l1) == 1 or len(l2) == 1:
    print("YES")
else:
    print("NO")
    
    
