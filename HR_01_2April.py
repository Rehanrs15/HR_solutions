x,n = map(int,input().split(" "))
new = int(str(x)*n)
count = 0
for i in range(1,new+1):
    val = i + (i + 1)
    l = len(str(val))
    if l == 1:
        n = 1
    else:
        n = int("1"+"0"*(l-1))
    if n > 1 and val / int(n) != 0:
        count = count + 1
print(count)
