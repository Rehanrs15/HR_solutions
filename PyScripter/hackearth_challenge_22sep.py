from collections import Counter
s = raw_input()
S = dict()
for i in range(len(s)):
    if S.has_key(i):
        h = S.get(i)
        h = h + 1
        S[i]=h
    else:
        S[i]=1
l=["h","a","c","k","e","r","e","a","r","t","h"]
N=""
while len(S) != 0:
    for i in l:
        if S.has_key(i):
            if S.get(i) !=0:
                v = S.get(i)
                v = v - 1
                S[i]=v
                if v != -1:
                    N=N+i
                else:
                    del S[i]
print N
            
