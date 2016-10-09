from collections import OrderedDict
l = [10, 5, 3, 4, 3,6]
d = OrderedDict()
index = 0
for i in l:
    c = 0
    if i not in d.keys():
        d[i] = c + 1
    else:
        c = d[i] 
        d[i] = c + 1
for m in d.keys():
    if d[m] > 1:
        print(m)
        break
