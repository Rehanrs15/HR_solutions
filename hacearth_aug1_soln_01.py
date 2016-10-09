def Prime(s):
    n = 0
    if s == 1 or s == 2:
        return 0
    else:
        for i in range(2,s):
            if s % i != 0:
                n = n + 1
        return n
        

def findFactors(s,e):
    count = 0
    for i in range(s,e):
        print(len(str(i)),Prime(i))
        if len(str(s)) == Prime(i):
            count = count + 1
    return count


q = int(input())
for i in range(q):
    s,e = map(int,input().split(" "))
    len = findFactors(s,e)
    print(Prime(q))
