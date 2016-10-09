string = input()
d = dict()
a = 0
store = string[0]
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

l = list(d.keys())
print(l)
for i in range(0,10):
    if str(i) in l:
        print(i,d[str(i)])
    else:
        print(i,0)
