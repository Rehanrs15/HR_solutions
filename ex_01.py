import random
def bina(s,n):
    l = dict()
    while len(l) != n:
        shuffled = list(s)
        random.shuffle(shuffled)
        shuffled = "".join(shuffled)
        if l.has_key(shuffled):
            continue
        else:
            l[shuffled] = 1
        print l
    c = 0
    for i in l:
        val = int(i,2)
        if val%2 == 0:
            continue
        else:
            c = c + 1
    print c
    

t = int(input())
for j in range(t):
    si = int(input())
    s = input()
    bina(s,si)
