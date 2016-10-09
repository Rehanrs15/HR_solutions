n = int(input())
l = [-100]* n
for i in range(n):
    s = input()
    if s == "insert":
        index = int(input())
        num = int(input())
        l[index] = num
    elif s == "print":
        for j in l:
            if j != -100:
                print(j,end=" ")
    elif s == "remove":
        d = int(input())
        l.remove(d)
    elif s == "sort":
        l.sort()
    elif s == "pop":
        l.pop()
    elif s == "append":
        ni = int(input())
        l.append(ni)
