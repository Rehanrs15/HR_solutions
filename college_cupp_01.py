q = int(input())
for i in range(q):
    s = input()
    if len(s) == 1:
        print("YES")
    else:
        flag = 0
        for j in range(0,len(s)-1):
            vp = ord(s[j])
            vf = ord(s[j+1])
            val = abs(vp - vf)
            if val != 1 and val != 25:
                print("NO")
                flag = 1
                break
        if flag != 1:
            print("YES")
