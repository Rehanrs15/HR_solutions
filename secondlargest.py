l = [4,3,2,5,1]
l1 = l[0]
l2 = 0
for i in range(len(l)):
    if i < len(l) - 1:
        if l[i+1] > l1:
            l1 = l[i+1]
    if l[i] > l2 and l2 < l1:
        l2 = l[i]

print(l2)
        
        
