from collections import Counter
t = int(input())
for i in range(t):
    s = input()
    if(len(s) % 2 != 0):
        print(-1)
        continue
    else:
        s1 = Counter(s[0:len(s)//2])
        s2 = Counter(s[len(s)//2:])
        d = s1 - s2
        print(d)
        print(sum(d.values()))
    
