testcase = int(input())
finallist = list()
for k in range(0,testcase):
    string = input()
    r = list(string)
    r = r[::-1]  
    reverse = "".join(r)
    flag= 0
    for i in range(1,len(string)-1):
        x1 = ord(string[i])
        x2 = ord(string[i-1])
        y1 = ord(reverse[i])
        y2 = ord(reverse[i-1])
        if abs(x1 - x2)!=abs(y1-y2):
            flag = 1
            break
        else:
            flag = 0
    if flag == 1:
        finallist.append("Not Funny")
    else:
        finallist.append("Funny")

for i in finallist:
    print(i)
    
