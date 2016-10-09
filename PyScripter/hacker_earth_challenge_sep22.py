from collections import Counter
s = raw_input()
l=["h","a","c","k","e","r","e","a","r","t","h"]
S = Counter(s)
f = 0
for i in l:
    if S.has_key(i):
        continue
    else:
        f = 1
        break
if f == 1:
    print(0)
else:
    Values = S.values()
    print(min(Values))
    
