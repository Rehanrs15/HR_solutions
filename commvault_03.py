import re
s = input()
m = input()
for i in m:
    num = re.sub(i,'',s)

print(num)
