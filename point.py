import sys


n = int(input().strip())
sx = set()
sy = set()
for a0 in range(n):
    x,y = map(int,input().strip().split(' '))
    sx.update({x})
    sy.update({y})

print(sx,sy)
print('YES' if len(sx)==1 or len(sy)==1 else 'NO')
