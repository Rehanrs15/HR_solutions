num = input()
n,m = num.split(" ")
arr = input()
l = list(arr.split(" "))
finallist = [0] * len(l)
m = int(m)
for i in range(m,len(l)):
    finallist[i - m] = int(l[i])
k = 0
for j in range(len(l) - m, len(finallist)):
    if(k < m):
        finallist[j] = int(l[k])
        k = k + 1
    else:
        break
for o in finallist:
    print(o,end=" ")
