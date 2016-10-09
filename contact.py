import re 
operations = int(input())
l = list()
count = 0
for i in range(operations):
    query = input()
    op,st = query.split(" ")
    if op == "add":
        l.insert(count,st)
        count = count + 1
    elif op == "find":
        reg = r'^'+st
        for m in l:
            x = re.findall(reg,m)
        c = 0
        print(x)
        for j in x:
            if j != []:
                c = c + 1
        print(c)
            
