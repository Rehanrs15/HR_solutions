c = 0
def toBinary(n):
    f = ""
    while n > 0:
        b = n % 2
        f = f + str(b)
        n = int(n / 2)
    return f[::-1]

def countNoOfOne(x):
    s = str(x)
    m = 0
    for i in s:
        if i == "1":
            m = m + 1
    global c 
    c = c + m
            
    
num = int(input())
for i in range(1,num+1):
    x = toBinary(i)
    countNoOfOne(x)
print(c)
