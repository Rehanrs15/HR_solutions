def Anagrams(L):
    new = list()
    for i in L:
        new.append("".join(sorted(i)))
    N = list()
    for i in range(len(new)-1):
        for j in range(i,len(new)):
            if new[i] == new[j]:
                N.append([i+1,j+1])
    print(N)

i = list(map(str,input().split()))
Anagrams(i)
        
