t = input()
for i in range(int(t)):
    s = input()
    if len(s) == 1:
        print("NO")
        continue
    elif (s[:int(len(s)/2)] == s[int(len(s)/2):]):
        print("YES")
    else:
        for j in range(len(s)):
            l = s[:j]
            f = 0
            r = s[j+1:]
            if l == r:
                print("YES")
                f = 1
                break
        if f != 1:
            print("NO")
