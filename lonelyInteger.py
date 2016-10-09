no = int(input())
items = input()
l = items.split(" ")
string = "".join(l)
d = dict()
a = 0
store = string[0]
if len(l) == 1:
    print(l[0])
    exit(0)

for s in string:
        if store == s:
                a=a+1
                d[s]=a
        else:
                if s in d.keys():
                    a = d[s]
                    a =a+1
                    d[s] = a
                    store = s
                else:
                    a = 1
                    d[s] = a
                    store = s

minimum = d[l[0]]
key = 0
for i in d.keys():
    if d[i] < minimum:
        minimum = d[i]
        key = i
print(key)
