a = [1,2,3,4,1,2,3,4,1,2,3,4,5,6,7,4,3,6,7]
d = dict()
for i in a:
    c = 0
    if i not in d.keys():
        d[i] = c + 1
    else:
        c = d[i]
        d[i] = c + 1

print("Numbers","  times they repeated")
for i,j in d.items():
    print(" "*3,i," "*5,j)


print("\n\nNumbers which repeated more than once")
for u in d.keys():
    if d[u] > 1:
        print(u,end=" ")
    
