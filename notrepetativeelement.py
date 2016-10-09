x = [1,2,3,1,2,3,5,1,3,6,6,4]
d = dict()
for i in x:
    c = 0
    if i not in d.keys():
        c = c + 1
        d[i] = c
    else:
        c = d[i] + 1
        d[i] = c
    
for x in d.keys():
    if d[x] == 1:
        print(x)
    
