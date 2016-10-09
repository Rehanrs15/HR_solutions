s = input()

c=0
for i in range(0,len(s)):
    for j in range(i,len(s)+1):
        if s[i:j] != (s[i:j])[::-1]:
            x = len(s[i:j])
            if x > c:
                c = x
    s = s[i:]
print(c)
