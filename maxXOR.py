L = int(input())
R = int(input())
List = list(range(L,R+1))
maxvalue = 0
for i in range(len(List)):
    for j in range(i,len(List)):
        val = List[i] ^ List[j]
        if val > maxvalue:
            maxvalue = val

print(maxvalue)
        
        
