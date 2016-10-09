s=input()
d=list()
m=int(input())
s1=""
for i in s:
    if i not in d:
        d.append(i)
        m=m-1
    if m == -1:
        break
    
    s1=s1+i
print(s1)
    
