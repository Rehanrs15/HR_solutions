def todecimal(n):
    num = 0
    n = str(n)
    for i in range(0,len(n)):
        num = num + (int(n[i]) * (2**(len(n)-i-1)))
    return num

def positionofsetBit(x):
    print(x - (x / 2))

n = int(input())
x = todecimal(n)
positionofsetBit(x)
        
        
