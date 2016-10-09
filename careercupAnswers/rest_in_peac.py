t = int(input())
for i in range(t):
    n = input()
    l = list()
    for j in range(len(n)):
        s = ""
        for k in range(j+1,len(n)):
            if k <= len(n)-2:
                s = s[j] + s[k]
                l.append(s)
    print(l)
            
