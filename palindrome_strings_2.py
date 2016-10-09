t = int(input())
for j in range(t):
    s1 = input()
    s2 = input()
    c = 0
    for i in s2:
        if i in s1:
            c = 1
            print("YES5")
            break
    if c!=1:
        print("NO")
