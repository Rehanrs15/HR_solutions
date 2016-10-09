a = [0,1,2,3,4,5,1,2,6,3,4]
d = ["a"] * len(a)
j = 0
final = list()
k = 0
for i in a:
    if i not in d:
        d[j] = i
        final.insert(i,k)
        k = k + 1
    else:
        a[j] = 0
    j = j + 1

print(final)
