def toBinary(n):
    tobin = str(bin(n))
    return tobin[2:]

def toDecical(n):
    return int(str(n),2)

li = list()
def XOR(l,length):
    global li
    v = sum(l)%10
    li.append(v)
    

n,k = map(int,input().split())
L = list(map(int,input().split()))

for i in range(0,len(L)):
    v = L[i:i+k]
    length = len(v)
    if  length == k:
        XOR(v,length)
print(max(li))
